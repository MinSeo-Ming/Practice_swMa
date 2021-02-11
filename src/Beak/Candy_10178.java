package Beak;

import java.io.*;
import java.util.StringTokenizer;

public class Candy_10178 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        String s1 = "You get ";
        int can,peo,re,n,m;
        String s2 = " piece(s) and your dad gets ";
        String s3 = " piece(s).";
        StringTokenizer st ;
        while (repeat-->0){
            st = new StringTokenizer(br.readLine());
            can= Integer.parseInt(st.nextToken());
            peo= Integer.parseInt(st.nextToken());
            n= can/peo;
            re = can%peo;
            System.out.println(s1+n+s2+re+s3);
        }
    }
}
