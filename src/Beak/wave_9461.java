package Beak;

import java.util.Scanner;

public class wave_9461 {
    static Long result[] =new Long[102];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        result[1]= result[2]=result[3]=1L;
        result[4]=result[5]=2L;
        while (repeat-->0){
            int n = sc.nextInt();
            System.out.println(rep(n));
        }
    }
    static long rep(int n){
        if(result[n]==null){
            result[n]= rep(n-2)+rep(n-3);
        }
        return result[n];
    }
}