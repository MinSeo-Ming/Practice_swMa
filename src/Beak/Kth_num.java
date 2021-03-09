package Beak;

import java.util.Arrays;
import java.util.Scanner;

public class Kth_num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(sol(n,m));
    }
    static int sol(int n, int k){
        int temp [] = new int[n*n];
        int idx =0;
        for(int i=1; i<=n; i++){
            for(int j =1; j<=n; j++){
                if(idx==k)
                    return i*j;
                idx++;
            }
        }
        return 0;
    }
}
