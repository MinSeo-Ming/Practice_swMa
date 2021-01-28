package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class postorder_cal {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        String [] cal = sc.next().split("");
        Stack<Double>stack = new Stack<>();

        for(int i=0; i<num; i++) {
            stack.push(sc.nextDouble());
        }
        for(String ch : cal){
            if(!ch.matches("^[A-Z]*$")) {
                double a = stack.pop();
                double b = stack.pop();
                double c=0;
                switch (ch){
                    case "*":
                        c =a*b;
                        break;
                    case "-":
                        c =a-b;
                        break;
                    case "+":
                        c =a+b;
                        break;
                    case "/":
                        c =a/b;
                        break;
                }
                System.out.print(c+"    ");
                stack.push(c);
            }
        }
        System.out.println(String.format("\n%.2f",stack.pop()));
    }
}
