package proGrammers;

import java.util.Scanner;

public class prgrammer {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String temp3 = sc.next();
        System.out.println(solution(temp3));
    }

    public static String solution(String new_id) {
        String answer = new_id.toLowerCase();
        String pattern = "[^0-9a-z-_\\.]";
        String pattern2 = "[\\.]{2,}";
        answer = answer.replaceAll(pattern,"");
        answer = answer.replaceAll(pattern2,".");
        if(answer.charAt(0)=='.') answer = answer.substring(1);
        if(answer.equals(""))answer=answer.concat("a");
        if(answer.length()>15)answer = answer.substring(0,15);
        int len = answer.length();
//        System.out.println(answer);
        if(answer.charAt(len-1)=='.')answer = answer.substring(0,len-1);
        if(answer.length()<3){
            String temp = Character.toString(answer.charAt(answer.length()-1));
            for(int i=answer.length(); i<3; i++){
               answer= answer.concat(temp);
            }
        }
        return answer;
    }
}
