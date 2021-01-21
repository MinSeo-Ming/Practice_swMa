package Beak;

import java.io.*;
import java.util.*;

public class cabbage_1012 {
    static int m,n,k; //순서대로 밭 가로, 세로 그리고 배추 개수
    static int cnt;// 배추 벌레 갯수
    static int[][] field;//배추밭!
    static boolean visited[][];//방문 여부 확인
    static int dx []={1,-1,0,0}; // x축 이동 방향!
    static int dy []={0,0,1,-1};// y축 이동 방향!

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int testcase = Integer.parseInt(st.nextToken()); //반복하는 횟수
        while (testcase>0) {
            testcase--;// 반복하기!!
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            //초기화하기!
            visited = new boolean[n][m];
            field = new int[n][m];

            cnt =0; //배추벌레 갯수 초기화

            //어디에 배추가 있는 지 입력받기
            for(int i=0; i<k; i++){
                st = new StringTokenizer(br.readLine());
                //x랑 y랑 거꾸로 한 이윤 : 그냥 내 취향..??
                // 개인적으로 배열 [][] 이렇게 된 경우 xy 설정하는 게 습관이 되어서 이렇게 사용함.
                // 그래선지 한번씩 한템포씩 더 생각함.. 비효율 적인듯...
                int y= Integer.parseInt(st.nextToken());
                int x= Integer.parseInt(st.nextToken());
                field[x][y] =1;
            }
            for(int i=0; i<n; i++){
                for (int j =0; j<m; j++){
                    if(!visited[i][j]&& field[i][j]==1) {
                        cnt++;
                        //dfs(i, j);
                        bfs(i, j);

                    }
                }
            }
            //배추흰지렁이 몇마리인지
            System.out.println(cnt);

        }
    }
    static void bfs(int x, int y){
        //bfs니까 queue에 삽입 int[]인 이유는 좌표라서 이렇게 표현함
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        while (!q.isEmpty()){
            int []temp = q.poll();
            visited[temp[0]][temp[1]] =true; // 방문표시
            for(int i=0; i<4; i++){
                //사방 체크
                int x_t = temp[0] +dx[i];
                int y_t = temp[1] +dy[i];
                if(0<=x_t&&0<=y_t&&x_t<n&&y_t<m) {
                    if (!visited[x_t][y_t] && field[x_t][y_t] == 1) {
                        //방문 한적이 없고 옆에연결되었으면 진행하고 queue에 추가
                        q.offer(new int[]{x_t,y_t});
                        visited[x_t][y_t] =true;
                    }
                }
            }
        }
    }

    static void dfs(int x,int y){
        visited[x][y] =true;
        for (int i=0; i<4; i++){
            //4방 검사
            int x_t = x +dx[i];
            int y_t = y +dy[i];
            if(0<=x_t&&0<=y_t&&x_t<n&&y_t<m){
                if(!visited[x_t][y_t]&& field[x_t][y_t]==1)
                    //재귀!!
                    dfs(x_t,y_t);
            }
        }
    }
}
