package Beak;

import java.util.ArrayList;
import java.util.Scanner;

public class erto_29960 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();
        ArrayList<Boolean> numbers = new ArrayList<>();
        numbers.add(false);
        numbers.add(false);
        for(int i=2; i<=n; i++){
            numbers.add(i,true);
        }
        for(int i=2; (i*i)<=n; i++){
            if(numbers.get(i)) {
                k--;
                if(k==0) {
                    System.out.println(i);
                }
                for (int j = i * i; j <= n; j += i) {
                    k--;
                    numbers.set(j,false);
                    if(k==0) {
                        System.out.println(j);
                    }
                }
            }
        }

    }
}
