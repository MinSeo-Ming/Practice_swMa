package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class space_2583_dfs {
    static  int [][]map_real;
    static int count[];
    static int idx=0;
    static  boolean check[][];
    static int dx[] ={1,-1,0,0};
    static int dy[] ={0,0,1,-1};
    static int n,m;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        map_real =new int[n][m];
        check = new  boolean[n][m];
        count = new int[n*m];

        for(int i =0; i<k; i++){
            String []s = (br.readLine().split(" "));
            for(int j=n-Integer.parseInt(s[3]); j<n-Integer.parseInt(s[1]); j++ ){
                for(int l =Integer.parseInt(s[0]); l<Integer.parseInt(s[2]); l++){
                    map_real[j][l] ++;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                if(!check[i][j]&&map_real[i][j]==0){
                    ++idx;
                    dfs(i,j);
                }
            }
        }
        Arrays.sort(count);
        System.out.println(idx);
        for(int i: count){
            if(i>0) System.out.print(i+" ");
        }
        System.out.println();
    }

    static void dfs(int i, int j){
        check[i][j] =true;
        count[idx]++;
        for(int k=0; k<4; k++){
            int n_x = i + dx[k];
            int n_y = j + dy[k];
            if(0<=n_x &&0<= n_y && n_x <n&& n_y<m) {
                if(map_real[n_x][n_y] ==0&&!check[n_x][n_y])
                    dfs(n_x,n_y);
            }
        }
    }
}
