package proGrammers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class order {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat =6;
        int cp = repeat;
        String [] info = new String[repeat];
        String [] query = new String[cp];
        int i=0;
        while (repeat-->0){
            info[i++] = br.readLine();
        }
        i=0;
        while (cp-->0){
            query[i++]= br.readLine().replaceAll("and ","");
        }
        int[] result =solution(info, query);
        for(int j : result) System.out.print("\n"+j + " ");
    }
    public static int[] solution(String[] info, String[] query) {
        StringTokenizer st;
        String people [][] = new String[info.length][5];
        String condition [][] = new String[query.length][5];
        int[] answer =new int[query.length];
        for(int i=0; i< info.length; i++){
            st = new StringTokenizer(info[i]," ");
            int j =0;
            while (st.hasMoreTokens()) {
                people[i][j] =st.nextToken();;
                j++;
            }
        }
        for(int i=0; i< query.length; i++){
            st = new StringTokenizer(query[i]," ");
            int j =0;
            while (st.hasMoreTokens()) {
                condition[i][j++] = st.nextToken();
            }
        }
        int idx=0;
        int i;
        for(String temp[] : condition){
            for(String person[] :people){
                i=0;
                if(!temp[i].equals("-")&&!temp[i].equals(person[i]))continue;
                else i++;
                if(!temp[i].equals("-")&&!temp[i].equals(person[i]))continue;
                else i++;
                if(!temp[i].equals("-")&&!temp[i].equals(person[i]))continue;
                else i++;
                if(!temp[i].equals("-")&&!temp[i].equals(person[i]))continue;
                else i++;
                if(Integer.parseInt(person[i])>=Integer.parseInt(temp[i])) {
                    answer[idx]++;
                    i=0;
                }
            }
            idx++;
        }
        return answer;
    }
    /*
    java backend junior pizza 150
python frontend senior chicken 210
python frontend senior chicken 150
cpp backend senior pizza 260
java backend junior chicken 80
python backend senior chicken 50
java and backend and junior and pizza 100
python and frontend and senior and chicken 200
cpp and - and senior and pizza 250
- and backend and senior and - 150
- and - and - and chicken 100
- and - and - and - 150
     */
}
