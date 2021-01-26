package Beak;

import java.util.Scanner;

public class bridge {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();

        while (repeat-->0){
            int r = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(combination(r,c));
        }
    }
    static long fact(int n,int cnt){
        if(cnt==0)return 1;
        return n * fact(n-1,cnt-1);
    }
    static long combination(int r, int c){
        if(c-r<r) r = c-r;
        long numerator = fact(c,r);
        long denominator = fact(r,r);
        return numerator/denominator;
    }
}
