package datastruct.recur;

import java.util.Scanner;

public class P_hanoi {
    static int count=0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        soultion(n,1,3,2);
        System.out.println(count);
    }
    static void move(int n, int from, int to){
        System.out.println(n+" 이 "+from+"서부터 "+to+"로 이동했다.");
    }
    static void soultion(int n,int from,int to, int by){
        count++;
        if(n==1){
            move(n,from,to);
            return;
        }
        else{
            soultion(n-1,from,by,to);
            move(n,from,to);
            soultion(n-1,by,to,from);
        }

    }
}
