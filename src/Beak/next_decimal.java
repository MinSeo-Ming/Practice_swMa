package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class next_decimal {
    static int size =63300;
    static ArrayList<Boolean> numbers = new ArrayList<>(size);
    public static void main(String args[]) throws IOException {
        de();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        while (repeat-->0){
            long num = Long.parseLong(br.readLine());
            for(int i=0; i<size; i++){
                if(i>=num&&numbers.get(i)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    static void de(){
        numbers.add(0,false);
        numbers.add(1,false);
        for(int i=2; i<=size; i++)
            numbers.add(i,true);
        for(int i=2; (i*i)<size; i++){
            if(numbers.get(i)){
                for(int j= i*i; j<=size; j+=i){
                    numbers.set(j,false);
                }
            }
        }
    }
}
