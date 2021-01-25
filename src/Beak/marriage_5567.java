package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class marriage_5567 {
    static int n,m;
    static ArrayList<ArrayList<Integer>> friends =new ArrayList<ArrayList<Integer>>();
    static boolean [] check;
    static int cnt=0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        check = new boolean[n+1];

        for(int i=0; i<=n; i++) friends.add(new ArrayList<Integer>());

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            friends.get(a).add(b);
            friends.get(b).add(a);
        }
        for(int i=2; i<=n; i++){
            if(friends.get(1).contains(i)){
                check[i]=true;
                for(int j =2; j<=n; j++){
                    if(friends.get(i).contains(j)) check[j]=true;
                }
            }
        }
        for(boolean ck : check){
            if(ck) cnt++;
        }
        System.out.println(cnt);
    }
}
