package codeup;

import java.util.Scanner;

public class GCD {
    public static void main(String args[]){
        Scanner sc  =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        if(a<b) gcd(b,a);
        else gcd(a,b);
    }
    static void gcd(int a,int b){
        int temp;
        while (b!=0){
            temp = b;
            b= a%b;
            a=temp;
        }
        System.out.println(a);
    }
}
