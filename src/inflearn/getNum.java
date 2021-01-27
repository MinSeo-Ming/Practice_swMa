package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class getNum {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        input = input.replaceAll("[^0-9]","");
        int num = Integer.parseInt(input);
        int cnt =2;
        int n = (int)(Math.sqrt(num)+1);
        for(int i=2;i<n; i++){
            if(num%i==0)
                cnt= cnt+2;
        }
        System.out.println(num+"\n"+cnt);
    }
}
