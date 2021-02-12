package Beak;

import java.io.*;

public class numcard_10815 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int repeat = Integer.parseInt(br.readLine());
        String s=br.readLine();
        int cards = Integer.parseInt(br.readLine());
        String s2[] = (br.readLine().split(" "));
        for(String ch:s2){
            cards--;
            if(s.contains(ch)) sb.append("1");
            else sb.append("0");
            if(cards>0) sb.append(" ");
        }
        System.out.println(sb);
    }
}
