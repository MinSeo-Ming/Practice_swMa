package datastruct.recur;

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x,y));
    }
    static int gcd(int x,int y){
        int temp;
        while (y>1){
            temp = y;
            y= x%y;
            x=temp;
        }
        return x;
    }
}
