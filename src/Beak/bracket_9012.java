package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bracket_9012 {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        while (repeat-->0){
            String input[] = br.readLine().split("");
            Stack<String> stack = new Stack<>();
            boolean ck =false;
            for(String ch: input){
                switch (ch){
                    case "(":
                        stack.push("(");
                        break;
                    case ")":
                        if(stack.isEmpty()) {
                            ck=true;
                            break;
                        }
                        stack.pop();
                        break;
                }
            }
            if(stack.isEmpty()){
                if(ck)
                    System.out.println("NO");
                else System.out.println("YES");
            }
            else System.out.println("NO");
            stack.empty();
        }
    }
}
