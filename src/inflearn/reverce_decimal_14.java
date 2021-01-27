package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class reverce_decimal_14 {
    static ArrayList<Boolean> primeList;
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            int temp = Integer.parseInt(st.nextToken());
            int t =0;
            while (temp>0){
                t  = t*10+temp%10;
                temp =temp/10;
            }
            erato(t);
            if(primeList.get(t))
                System.out.print(t+" ");
        }
    }
    static void erato(int n){
        if (n<=1)return;
        primeList = new ArrayList<Boolean>(n+1);
        primeList.add(false);
        primeList.add(false);

        for(int i=2; i<=n; i++){
            primeList.add(i, true);
        }
        for(int i=2; (i*i)<=n; i++){
            if(primeList.get(i)){
                for(int j = i*i; j<=n; j+=i)
                    primeList.set(j,false);
            }
        }
    }

}
