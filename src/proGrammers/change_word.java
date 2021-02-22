package proGrammers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class change_word {
    public static void main(String args[]) throws IOException {
        System.out.println(solution("hit", "cog",new String[] {"hot", "dot", "dog", "lot", "log", "cog"}));
    }
    public static int solution(String begin, String target, String[] words) {
        int answer = 0,idx;
        ArrayList<String> contains = new ArrayList<>();
        String tempary[] = target.split("");
        for(String t: tempary) contains.add(t);
        for(String temp: words){
            for(String ch: contains){
                if(temp.contains(ch)){
                    answer++;
                    idx=temp.indexOf(ch);
                    begin = begin.substring(0,idx).concat(ch).concat(begin.substring(idx+1));
                    contains.remove(ch);
                    break;

                }
            }
        }

        if(!target.equals(begin))
            answer =0;
        return answer;
    }
}
/*
print(solution("hit", "cog", ["hot", "dot", "dog", "lot", "log", "cog"]), 4)
print(solution("hit", "cog", ["hot", "dot", "dog", "lot", "log"]), 0)
print(solution("hit", "hot", ["hot", "dot", "dog", "lot", "log"]), 1)
print(solution("1234567000", "1234567899", [
      "1234567800", "1234567890", "1234567899"]), 3)
print(solution("hit", "cog", ["cog", "log", "lot", "dog", "hot"]), 4)

 */