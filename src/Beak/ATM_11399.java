package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ATM_11399 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> input = new ArrayList<>();

        while(st.hasMoreTokens()){
            input.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(input);
        int sum =0;
        for(int i=0; i<size; i++){
            sum += input.get(i)*(size-i);
        }
        System.out.println(sum);
    }
}
