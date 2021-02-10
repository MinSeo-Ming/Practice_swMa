package Beak;

import java.io.*;
import java.util.*;

public class happy_15969 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num =Integer.parseInt(br.readLine());
        int [] numbers = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i=0;
        while (st.hasMoreTokens()){
            numbers[i++] =Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);
        System.out.println(numbers[num-1]-numbers[0]);
    }
}
