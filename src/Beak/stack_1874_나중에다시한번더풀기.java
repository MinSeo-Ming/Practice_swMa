package Beak;

import java.io.*;
import java.util.*;

public class stack_1874_나중에다시한번더풀기 {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int repeat = sc.nextInt();
        Stack<Integer> stack =new Stack<>();
        int start =0;

        while (repeat-->0){
            int value = sc.nextInt();
            if(value>start){
                for(int i= start+1; i<=value; i++){
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start =value;
            }
            else if(stack.peek()!=value){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}