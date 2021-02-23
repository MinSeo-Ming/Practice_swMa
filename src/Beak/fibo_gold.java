package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class fibo_gold {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int mod =1000000;
        int end =1500000;
        long arr[] = new long[end];
        arr[0] =0;
        arr[1] =1;
        for(int i=2; i<end&&i<=n; i++){
            arr[i]= (arr[i-1]+arr[i-2])%mod;
        }
        if(n>=end){
            n=n%end;
        }
        System.out.println(arr[(int)n]);
    }
}
