package inflearn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class every_cd_09 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            System.out.print(cnt(i)+" ");
        }
        System.out.println();
    }
    static int cnt(int n){
        if( n ==1)
            return 1;
        else{
            int count =1;
            for(int i=2; i<=n; i++){
                if(n%i==0) count++;
            }
            return count;
        }
    }
}
