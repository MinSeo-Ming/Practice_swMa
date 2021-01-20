package Beak;

import java.io.*;
import java.util.*;

public class BFS_DFS {
    static int n,e;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static boolean check [];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        for(int i=0; i<=n; i++)
            graph.add(new ArrayList<Integer>());

        for(int i =0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            // 연결된 간선 찢어서 연결하기 무방향이라 이렇게 함함
            int t_f = Integer.parseInt(st.nextToken());
            int t_s = Integer.parseInt(st.nextToken());

            graph.get(t_f).add(t_s);
            graph.get(t_s).add(t_f);
        }
        for(ArrayList temp : graph)
            Collections.sort(temp);

        check = new boolean[n+1];
        dfs(start);
        System.out.println();
        check = new boolean[n+1];
        bfs(start);

    }
    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        check[start] =true;
        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node+" ");
            for(int i:graph.get(node)){
                if(check[i]==false){
                    q.offer(i);
                    check[i]=true;
                }
            }
        }
    }
    static void dfs(int start){
        check[start] =true;
        System.out.print(start+" ");
        for(int i: graph.get(start)){
            if(check[i]==false)
                dfs(i);
        }

    }
}
