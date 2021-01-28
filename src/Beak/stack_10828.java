package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class stack_10828 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int repeat = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();
        while (repeat-->0){
            st = new StringTokenizer(br.readLine());
            String  offer = st.nextToken();
            int num=0;
            if(st.hasMoreTokens())
                num = Integer.parseInt(st.nextToken());
            switch (offer){
                case "push":
                    stack.push(num);
                    break;
                case "pop":
                    if(stack.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(stack.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "top":
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.peek());
                    break;
            }
        }
    }
}
