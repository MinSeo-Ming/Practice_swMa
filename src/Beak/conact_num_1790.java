package Beak;

import java.util.Scanner;

public class conact_num_1790 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        soultion(n,k);
    }
    static void soultion(int n,int k){
        int ten = (int) Math.log10((double) k);
        int remain,num;
        String s;
//        System.out.println(ten);
        if(ten==0) {
            System.out.println(n);
            return;
        }
        else {
            k-= (int) Math.pow(10,ten)-1;
            remain =n%ten;
            n = n/ten;
            num = (int) Math.pow(10,ten)+n-1;
            s = Integer.toString(num);
            if(num>n)
            System.out.println(num+" "+s.charAt(ten-remain));
            return;
        }

    }
//    static void soultion(StringBuilder s, int k){
//        char temp =s.charAt(k-1);
//        System.out.println(temp);
//    }
}
