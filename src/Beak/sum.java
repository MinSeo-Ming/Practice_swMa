package Beak;

import java.io.*;

public class sum {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n1 = Integer.parseInt(s[0],2);
        int n2 = Integer.parseInt(s[1],2);
        System.out.println(Integer.toBinaryString(n1+n2));
    }
}
