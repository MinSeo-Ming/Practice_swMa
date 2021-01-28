package Beak;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Josephus_1158 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int end = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=number; i++){
            q.add(i);
        }
        System.out.print("<");
        for(int i=0; i<number-1; i++){
            for(int j =0; j<end-1; j++){
                q.add(q.poll());
            }
            System.out.print(q.poll()+", ");
        }
        System.out.println(q.poll()+">");
    }
}
