package Beak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class rope_2217 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        int cp = repeat;
        ArrayList<Integer> l= new ArrayList<>();
        while (repeat-->0){
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        int max = cp * l.get(0);
        int cnt =1;
        for(int i=l.size()-1; i>0; i--){
            if(l.get(i)*cnt > max){
                max =l.get(i)*cnt;
            }
            cnt++;
        }
        System.out.println(max);
    }
}
