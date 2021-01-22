package Beak;

import java.util.*;

// 어려웠으나 해결함 !! 그러므로 잘적어야지.

public class move_night_7562 {
    static  int [][] cnt = new int[301][301] ;
    static int l;
    static  int [] start = new int[2];
    static  int [] end = new int[2];
    static int dx[] ={1,1,2,2,-1,-1,-2,-2};
    static int dy[] ={2,-2,1,-1,2,-2,1,-1};
    static boolean check [][];

    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        int repeat =sc.nextInt();

        int idx =0;

        while (repeat>0){
            repeat--;
            l = sc.nextInt();
            start[0] =sc.nextInt();
            start[1] =sc.nextInt();
            end[0] =sc.nextInt();
            end[1] =sc.nextInt();
            if(start[0] ==end[0] &&start[1]==end[1])
                System.out.println(0);
            else {
                check = new boolean[l][l];
                bfs(idx);
                idx += 1;
            }
        }
    }
    static void bfs(int idx){
        Queue<int[]> q = new LinkedList<>();
        q.add(start);
        cnt[start[0]][start[1]] =1;
        while (!q.isEmpty()){
            int temp[] = q.poll();
            check[temp[0]][temp[1]] =true;
            for(int i=0; i<8;i++){
                int x = temp[0] +dx[i];
                int y = temp[1] +dy[i];
                if(0<=x&&0<=y&&x<l&&y<l){
                    if(x==end[0]&&y==end[1]) {
                        System.out.println(cnt[temp[0]][temp[1]]);
                        return;
                    }
                    if(!check[x][y]){
                        q.offer(new int[]{x,y});
                        check[x][y] =true;
                        cnt[x][y]= cnt[temp[0]][temp[1]] +1;
                    }
                }
            }
        }
    }
}
