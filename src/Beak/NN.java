package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NN {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int re = Integer.parseInt(st.nextToken());
        StringBuilder result=new StringBuilder();
        for(int i=0; i<Integer.parseInt(s); i++){
            result.append(s);
        }
        if(Integer.parseInt(s)>re)
            System.out.println(result.substring(0,re));
    }
}
