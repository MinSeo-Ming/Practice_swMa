package proGrammers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class list_phonenum {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(new String[]{"113", "44", "4544"}));
    }
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book, Comparator.comparing(String::length));
        String cmp[];
        String temp;
        int count=0;
        for(int j=1; j<phone_book.length; j++) {
            if (phone_book[0].length() != phone_book[j].length())
                break;
            count++;
        }
        if(count ==0) count =1;
        cmp= new String[count];
        cmp[0] = phone_book[0];
        for(int i=1; i<count; i++) cmp[i] =phone_book[i];
        out: for(int j=0; j<count; j++) {
            for (int i = j+1; i < phone_book.length; i++) {
                temp = phone_book[i].substring(0,cmp[j].length());
                if (temp.contains(cmp[j])) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}

/* 간단한 문제로는 startsWith 를 사용하면 되나보다

 */