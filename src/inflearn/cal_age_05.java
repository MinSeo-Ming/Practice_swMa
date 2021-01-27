package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cal_age_05 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String people []= br.readLine().split("-");
        int now = 2019;
        int nineteen = 1900;
        int twenty = 2000;

        int st = Integer.parseInt(people[0].substring(0,2));
        int sex = people[1].charAt(0)-'0';

        if(sex<3) System.out.print(now-(nineteen+st)+1);
        else System.out.print(now-(twenty+st)+1);
        if(sex%2==0)System.out.println(" W");
        else System.out.println(" M");




    }
}
