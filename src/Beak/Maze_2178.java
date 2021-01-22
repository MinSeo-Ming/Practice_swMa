package Beak;

import java.io.*;
import java.util.*;

public class Maze_2178 {
    static int n,m;
    static int[][] maze;
    static boolean [][] check;
    static int dx []={1,-1,0,0}; // x축 이동 방향!
    static int dy []={0,0,1,-1};// y축 이동 방향!
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze = new int[n][m];
        check = new boolean[n][m];
        //한줄씩 입력받아서 배열에 저장
        for(int i=0; i<n; i++){
            String[] s = br.readLine().split("");
            int j =0;
            for(String c: s){
                maze[i][j++] =Integer.parseInt(c);
            }
        }
        bfs();
        System.out.println(maze[n-1][m-1]);

    }
    static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        while(!q.isEmpty()){
            int temp [] = q.poll();
            check[temp[0]][temp[1]] =true;
            for(int i=0; i<4; i++){
                int x = temp[0] +dx[i];
                int y = temp[1] +dy[i];
                if(0<=x&&0<=y&&x<n&&y<m){
                    if(maze[x][y]==1&& !check[x][y]){
                        q.offer(new int[]{x,y});
                        maze[x][y]= maze[temp[0]][temp[1]]+1;
                    }
                }
            }
        }
    }
}
