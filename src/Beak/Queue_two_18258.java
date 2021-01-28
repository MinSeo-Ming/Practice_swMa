package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue_two_18258 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int repeat = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        StringTokenizer st;

        while (repeat-- > 0) {
            st = new StringTokenizer(br.readLine()," ");
            switch (st.nextToken()) {
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    Integer it = queue.poll();
                    if (it ==null) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(it).append('\n');
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    if (queue.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                    break;
                case "front":
                    Integer item =queue.peek();
                    if (item==null) sb.append(-1).append('\n');
                    else sb.append(item).append('\n');
                    break;
                case "back":
                    Integer ite= queue.peekLast();
                    if (ite ==null) sb.append(-1).append('\n');
                    else sb.append(ite).append('\n');
                    break;
            }
        }
        System.out.println(sb);

    }
}
