package proGrammers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class travel {
    public static void main(String args[]) throws IOException {
        System.out.println(solution(new String[][] {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}}));
    }
    public static String[] solution(String[][] tickets) {
        String[] answer = {};
        ArrayList<ArrayList<String>> temp  = new ArrayList<ArrayList<String>>();
        
        return answer;
    }
    static dfs(String)
}
/*
case : [[ICN, A], [A, C], [A, D], [D, B], [B, A]]
return : [ICN, A, D, B, A, C]

tickets = [['ICN','B'],['B','ICN'],['ICN','A'],['A','D'],['D','A']]
answer = ['ICN', 'B', 'ICN', 'A', 'D', 'A']

 */