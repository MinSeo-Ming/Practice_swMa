package Beak;

import java.io.*;
import java.util.Stack;

public class balance_world {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[];
        StringBuilder sb = new StringBuilder();
        Stack<String> st;
        while (true) {
            s = br.readLine().split("");
            out:
            if (s[0].equals(".")) {
                System.out.println(sb);
                return;
            } else {
                st = new Stack<>();
                for (int i = 0; i < s.length; i++) {
                    switch (s[i]) {
                        case "(":
                        case "[":
                            st.push(s[i]);
                            break;
                        case ")":
                            if (!st.isEmpty()) {
                                if (st.peek().equals("(")) st.pop();
                                else {
                                    sb.append("NO").append("\n");
                                    break out;
                                }
                            } else {
                                sb.append("NO").append("\n");
                                break out;
                            }
                            break;
                        case "]":
                            if (!st.isEmpty()) {
                                if (st.peek().equals("[")) st.pop();
                                else {
                                    sb.append("NO").append("\n");
                                    break out;
                                }
                            } else {
                                sb.append("NO").append("\n");
                                break out;
                            }
                            break;
                        case ".":
                            sb.append("YES").append("\n");
                            break out;
                        default: break;
                    }
                }
            }
        }
    }
}
