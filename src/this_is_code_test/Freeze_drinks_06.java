package this_is_code_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Freeze_drinks_06 {
    static int n,m;
    static int[][] graph;
    static boolean [][] check;
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,-1,1};
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        check = new boolean[n][m];

        for(int i=0; i<n; i++){
            String s[] = br.readLine().split("");
            int j =0;
            for(String ch :s){
                graph[i][j++] =Integer.parseInt(ch);
            }
        }
        int cnt =0;
        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                if(!check[i][j] &&graph[i][j]==0) {
                    ++cnt;
                    dfs(i, j);
                }
            }
        }
        System.out.println(cnt);

    }
    static void dfs(int x,int y){
        check[x][y] = true;
        for(int i=0; i<4; i++){
            int r = x+dx[i];
            int c = y+dy[i];
            if(0<=r&&0<=c&&r<n&&c<m){
                if(!check[r][c] &&graph[r][c]==0)
                    dfs(r,c);
            }
        }
    }
}
/*
4 5
00110
00011
11111
00000

15 14
00000111100000
11111101111110
11011101101110
11011101100000
11011111111111
11011111111100
11000000011111
01111111111111
00000000011111
01111111111000
00011111111000
00000001111000
11111111110011
11100011111111
11100011111111

 */
