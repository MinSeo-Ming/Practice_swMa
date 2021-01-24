package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Find_pwd_17219 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int site = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        HashMap<String,String> list = new HashMap<>();
        for(int i=0; i<site; i++){
            st = new StringTokenizer(br.readLine());
            list.put(st.nextToken(),st.nextToken());
        }
        for(int i=0; i<num; i++){
            System.out.println(list.get(br.readLine()));
        }
    }
}
