package datastruct.recur;

import java.util.Scanner;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int re =1;
        for(int i=2; i<=n; i++){
            re *=i;
        }
        System.out.println(re);
    }
}
