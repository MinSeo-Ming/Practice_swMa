package proGrammers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class hot {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println(solution(new int[]{10, 10, 10, 10, 10}, 1));
    }
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        Arrays.sort(scoville);
        ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.stream(scoville).boxed().collect(Collectors.toList()));
        int t;
        if(temp.get(0)>=K) return 0;
        while (true) {
            t = temp.get(0) + temp.get(1) * 2;
            answer++;
//            System.out.println(t+" "+answer);
            temp.remove(1);
            temp.remove(0);
            temp.add(0, t);
            if (t >= K) {
                if (temp.size() == 1)  break;
                else if (temp.get(1) >= K) break;
            }
            else if(temp.size()==1) {
                answer = -1;
                break;
            }
            Collections.sort(temp);
        }
        return answer;
    }
}
/*
print(solution([1, 1, 1], 4), 2)
print(solution([10, 10, 10, 10, 10], 100), 4)
30 50 70
print(solution([1, 2, 3, 9, 10, 12], 7), 2)
print(solution([0, 2, 3, 9, 10, 12], 7), 2)
print(solution([0, 0, 3, 9, 10, 12], 7), 3)
print(solution([0, 0, 0, 0], 7), -1)
print(solution([0, 0, 3, 9, 10, 12], 7000), -1)
print(solution([0, 0, 3, 9, 10, 12], 0), 0)
print(solution([0, 0, 3, 9, 10, 12], 1), 2)
print(solution([0, 0], 0), 0)
print(solution([0, 0], 1), -1)
print(solution([1, 0], 1), 1)
 */