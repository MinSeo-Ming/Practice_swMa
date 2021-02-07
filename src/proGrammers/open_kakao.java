package proGrammers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class open_kakao {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int repeat = 5;
        String []record = new String[repeat];
        int i=0;
        while (repeat-->0){
            record[i] = br.readLine();
            i++;
        }

        String re[]= solution(record);
        for(String t : re) System.out.println(t);
//        for(String t : record) System.out.println(t);
    }
    public static  String[] solution(String[] record) {
        String result="",t1,t2;
        String[] st= {};
        String[] answer = {};
        String e ="님이 들어왔습니다.\n";
        String o ="님이 나갔습니다.\n";
        Map<String ,String > id_name = new LinkedHashMap<>();
        for(String t : record){
            st= t.split("\\s");
            t1 = st[1];
            if(st[0].equals("Change")){
                t2 = st[2];
                id_name.replace(t1,t2);
            }
            else if(st[0].equals("Enter")){
                result=result.concat(t1).concat(e);
                t2 = st[2];
                id_name.put(t1,t2);
            }
            else result=result.concat(t1).concat(o);
        }
        for(String id : id_name.keySet()){
            result=result.replace(id,id_name.get(id));
        }
        answer = result.split("\n");

        return answer;
    }

}
/*
Enter uid1234 Muzi
Enter uid4567 Prodo
Leave uid1234
Enter uid1234 Prodo
Change uid4567 Ryan
 6 8 9 10 11 12 13 14 16 17 18 19 20 21 22 24 25 26 27 28 29 30 31 32

 이정도면 다틀린듯?
 */