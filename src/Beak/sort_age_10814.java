package Beak;

import java.io.*;
import java.util.*;

public class sort_age_10814 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        HashMap<String,Integer> map = new LinkedHashMap<>();
        String sp[][]= new String[num][2];
        int i=0;
        for(int j =0; j<num; j++){
            sp[i]= br.readLine().split(" ");
            i++;
        }
        Arrays.sort(sp, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
            }
        });
        for(i=0; i<num; i++){
            System.out.println(sp[i][0]+" "+sp[i][1]);
        }
    }
}
