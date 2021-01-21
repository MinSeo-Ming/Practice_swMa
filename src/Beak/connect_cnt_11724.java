package Beak;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class connect_cnt_11724 {
    static boolean ck [];
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int edge = sc.nextInt();
        int cnt =0;

        for(int i=0; i<=node; i++){
            graph.add(new ArrayList<>());
        }
        ck = new boolean[node+1];

        for(int i=0; i<edge; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        for(ArrayList<Integer> t : graph){
            Collections.sort(t);
        }
        //항상 이부분 조심하기
        //리얼 주의

        for(int i=1; i<=node; i++){
            if(!ck[i]){
                ++cnt;
                dfs(i);
            }
        }
        System.out.println(cnt);
    }
    static void dfs(int x){
        ck[x] =true;
        for(int i : graph.get(x)){
            if(ck[i]==false)
                dfs(i);
        }
    }
}
