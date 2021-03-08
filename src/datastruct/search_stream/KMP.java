package datastruct.search_stream;

import java.util.Scanner;

public class KMP {
    public static void main(String args[]) {
        System.out.println("\n"+kmp("ABCABD","ABCABD"));
    }
    static int kmp(String txt, String pat){
        int pt =1;
        int pp =0;
        int skip[] = new int[pat.length()+1];
        //중복되는  검사하는 문자열중 중복되는 아이 찾기
        skip[pt] =0;
        while(pt != pat.length()){
            if(pat.charAt(pt)==pat.charAt(pp))
                skip[++pt] = ++pp;
            else if(pp==0)
                skip[++pt] =pp;
            else
                pp = skip[pp];
        }
        //검색 알고리즘

        pt =pp=0;

        while(pt!=txt.length()&&pp!= pat.length()){
            if(txt.charAt(pt)==pat.charAt(pp)){
                pt++;
                pp++;
            }
            else if(pp==0)
                pp++;
            else
                pp= skip[pp];
        }
        if(pp==pat.length())
            return pt-pp;
        return -1;
    }
}
