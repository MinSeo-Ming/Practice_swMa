package Beak;

import java.io.*;
import java.util.*;

public class aprt_2667 {
    static int [][] map;//아파트 단지ㅣ 받을 공간
    static int n,cnt; //n은 몇줄, 그리고 cnt는 단지 구분
    static boolean visited [][]; //방문여부
    static int group [] = new int[25*25]; // 단지 그룹이 몇개 나올지 미리 설정
    static int dx []={1,-1,0,0}; // x축 이동 방향!
    static int dy []={0,0,1,-1};// y축 이동 방향!


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        //아파트 단지와 방문여부 초기화
        map = new int[n][n];
        visited = new boolean[n][n];

        //map  채우기
        for(int i=0; i<n; i++){
            String temp_arr[] =br.readLine().split("");
            int j =0;
            for(String s: temp_arr){
                map[i][j++] =Integer.parseInt(s);
            }
        }

        //단지 구분하기기
       cnt =0;
        for(int i=0; i<n; i++){
            for(int j =0;j<n; j++){
                if(map[i][j] ==1 && !visited[i][j]){
                    ++cnt;
                    // dfs버전
                    dfs(i,j);
                    //bfs ver
                    bfs(i,j);
                }
            }
        }
        //단지 갯수
        System.out.println(cnt);
        // 아파트가 많은 순위로 정렬
        Arrays.sort(group);
        for(int i: group) {
            //아파트가 0이 아닌 경우에만
            if(i!=0) System.out.println(i);
        }
    }

    //bfs버전 너비 우선 탐색이니 queue를 사용함.
    static void bfs(int x,int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        while (!q.isEmpty()){
            int pop[] = q.poll();
            visited[pop[0]][pop[1]] =true;
            //아파트 단지 구분
            group[cnt]++;
            //방향이 4개라 for문 4번 반복
            for(int i=0; i<4; i++){
                int x_t = pop[0]+dx[i];
                int y_t = pop[1]+dy[i];
                if(0<=x_t && 0<=y_t && x_t <n&& y_t<n) {
                    //상하좌우 이동 만약 아파트가 있고 방문 하지 않았으면 queue에 넣고 방문했다 표시
                    if (map[x_t][y_t] == 1 && !visited[x_t][y_t]) {
                        q.offer(new int[]{x_t, y_t});
                        visited[x_t][y_t] = true;
                    }
                }
            }
        }
    }
    static void dfs(int x, int y){
        visited[x][y] = true;
        //아파트 단지내 아파트 수 세기
        group[cnt]++;
        for(int i =0; i<4; i++){
            // 방향 4개!
            int x_t = x + dx[i];
            int y_t = y + dy[i];
            // 테두리 밖이면 진행 안함
            if(0<=x_t && 0<=y_t && x_t <n&& y_t<n){
                // 방문한적이 없고 아파트가 있으면 진행!!
                if(!visited[x_t][y_t]&&map[x_t][y_t]==1){
                    dfs(x_t,y_t);
                }
            }
        }
    }
}
