package this_is_code_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class escape_maze {
    static int n, m;
    static int[][] graph;
    static boolean[][] check;
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
        bfs();
        System.out.println(graph[n-1][m-1]);

    }
    static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        while (!q.isEmpty()){
            int temp [] = q.poll();
            check[temp[0]][temp[1]] = true;
            for(int i=0; i<4; i++){
                int x = temp[0]+dx[i];
                int y = temp[1]+dy[i];
                if(x>=0&&y>=0&&n>x&&m>y){
                    if(!check[x][y]&&graph[x][y]==1){
                        q.offer(new int[]{x,y});
                        check[x][y] =true;
                        graph[x][y] = graph[temp[0]][temp[1]]+1;
                    }
                }
            }
        }
    }
}
/*
5 6
101010
111111
000001
111111
111111

 */