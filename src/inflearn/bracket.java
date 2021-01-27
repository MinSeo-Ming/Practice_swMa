package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bracket {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        Stack<String> input = new Stack<>();
        for (String ch : s) {
            if (ch.equals("(")) input.push("(");
            else input.pop();
        }
        if(input.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }
}
