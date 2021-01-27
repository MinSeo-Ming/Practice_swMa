package inflearn;

import java.util.Scanner;

public class Quiz_17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();

        while (repeat>0){
            repeat--;
            int end  = sc.nextInt();
            int aws  = sc.nextInt();
            int cal;
            if(end%2!=0) cal= (1+end)*(end/2)+(end/2+1);
            else cal=((end+1)*(end/2));
            if(cal==aws) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
