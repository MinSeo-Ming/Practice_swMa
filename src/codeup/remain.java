package codeup;

import java.util.Scanner;

public class remain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt =0;
        cnt += num/50000;
        num %=50000;
        cnt += num/10000;
        num %=10000;
        cnt += num/5000;
        num %=5000;
        cnt += num/1000;
        num %=1000;
        cnt += num/500;
        num %=500;
        cnt += num/100;
        num %=100;
        cnt += num/50;
        num %=50;
        cnt += num/10;
        System.out.println(cnt);
    }
}
