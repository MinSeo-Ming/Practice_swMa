package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class count_decimal15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Boolean> numbers = new ArrayList<>();
        numbers.add(false);
        numbers.add(false);

        for(int i=2; i<=num; i++)
            numbers.add(i,true);

        for(int i=2; (i*i)<=num; i++){
            for(int j =i*i; j<=num; j+=i){
                numbers.set(j,false);
            }
        }
        int aws =0;
        for(boolean i:numbers){
            if(i) aws++;
        }
        System.out.println(aws);
    }
}
