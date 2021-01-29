package Beak;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class remain_14916 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int aws = 0;
        if (number % 5 == 0) {
            System.out.println(number / 5);
        } else {
            while (true) {
                if (number < 0) {
                    System.out.println(-1);
                    break;
                }
                if (number == 0) {
                    System.out.println(aws);
                    break;
                }
                number -= 2;
                aws++;
                if(number%5==0){
                    aws+=number/5;
                    System.out.println(aws);
                    break;
                }
            }
        }
    }
}
