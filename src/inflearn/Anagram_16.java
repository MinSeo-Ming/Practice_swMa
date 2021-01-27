package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class Anagram_16 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();

        String[] f_ = first.split("");
        String[] s_ = second.split("");

        HashMap<String,Integer> check = new HashMap<>();
        HashMap<String,Integer> check2 = new HashMap<>();

        for(String ch :f_){
            if(check.containsKey(ch)){
                int cnt_temp =check.get(ch)+1;
                check.remove(ch);
                check.put(ch,cnt_temp);
            }
            else {
                check.put(ch,1);
            }
        }
        for(String ch :s_){
            if(check2.containsKey(ch)){
                int cnt_temp =check2.get(ch)+1;
                check2.remove(ch);
                check2.put(ch,cnt_temp);
            }
            else {
                check2.put(ch,1);
            }
        }
        Set<String> aK = check.keySet();
        Set<String> bK = check2.keySet();

        if(bK.equals(aK)){
            for(String key : aK){
                if((check.get(key))!=(check2.get(key))){
                    System.out.println("NO");
                    return;
                }
                else
                    continue;
            }
        }
        else {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");

    }
}
