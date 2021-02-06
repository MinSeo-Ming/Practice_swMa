package codeup;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class remote {
    static int cel[];
    static int st,ed;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        cel=new int[]{1,-1,5,-5,10,-10};

        st = sc.nextInt();
        ed = sc.nextInt();
    }
    static void bfs(){
        Queue<Integer> q= new LinkedList<>();
        q.add(st);
        while (!q.isEmpty()){
            int temp = q.poll();
            for(int i=0; i<cel.length; i++){
                int temp_ = temp+ cel[i];

            }
        }

    }

}
