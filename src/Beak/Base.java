package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Base {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String number[] =st.nextToken().split("");
        int b = Integer.parseInt(st.nextToken());
        long aws =0;
        int j =0;
        for(int i=number.length-1; i>=0; i--){
            int temp;
            if(0<number[i].charAt(0)-'0'&&number[i].charAt(0)-'0'<=9) temp =number[i].charAt(0)-'0';
            else temp = number[i].charAt(0) - 'A' + 10;

            aws += temp * (long) Math.pow(b, i);
            j++;
        }
        System.out.println((int) aws);
    }
}
