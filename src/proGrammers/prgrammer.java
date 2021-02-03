package proGrammers;

public class prgrammer {
    public static void main(String args[]){

    }
}
class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        String pattern = "[0-9a-z-_\\.]";
        String pattern2 = "\\.{2,}";
        answer = answer.replaceAll(pattern,"");
        answer = answer.replaceAll(pattern2,".");
        if(answer.charAt(0)=='.') answer = answer.substring(1);
        if(answer.equals(""))answer.concat("a");
        if(answer.length()>16)answer = answer.substring(0,15);
        int len = answer.length();
        if(answer.charAt(len)=='.')answer = answer.substring(0,len-1);
        if(answer.length()<3){
            String temp = Character.toString(answer.charAt(answer.length()-1));
            while(answer.length()!=3){
                answer.concat(temp);
            }
        }
        return answer;
    }
}
