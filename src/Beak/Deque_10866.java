package Beak;

import java.io.*;
import java.util.*;
public class Deque_10866 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Deque<Integer> de = new ArrayDeque<>();
        while (repeat-->0){
            st = new StringTokenizer(br.readLine()," ");
            switch (st.nextToken()){
                case "push_back":
                    de.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "push_front":
                    de.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_back":
                    Integer i_1 = de.pollLast();
                    if(i_1==null) sb.append(-1).append("\n");
                    else sb.append(i_1).append("\n");
                    break;
                case "pop_front":
                    Integer i_2 = de.pollFirst();
                    if(i_2==null) sb.append(-1).append("\n");
                    else sb.append(i_2).append("\n");
                    break;
                case "size":
                    sb.append(de.size()).append("\n");
                    break;
                case "empty":
                    if(de.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front":
                    Integer i_3 = de.peekFirst();
                    if(i_3==null) sb.append(-1).append("\n");
                    else sb.append(i_3).append("\n");
                    break;
                case "back":
                    Integer i_4 = de.peekLast();
                    if(i_4==null) sb.append(-1).append("\n");
                    else sb.append(i_4).append("\n");
                    break;

            }
        }
        System.out.println(sb);
    }
}
