package proGrammers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class diskcontrol {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(new int[][]{{0, 3}, {1, 9}, {2, 6}}));
    }
    public static int solution(int[][] jobs) {
        int answer = 0;
        int temp_e=jobs[1][1], temp_r1=0;
        for(int i=0; i< jobs.length-1; i++){
            answer += jobs[i][1];
            for(int j = i+1; j<jobs.length; j++){
                if(temp_e>jobs[j][1]&&answer>=jobs[j][0]) {
                    temp_e=jobs[j][1];
                    temp_r1 =j;
                }
            }
            System.out.println(answer);
            System.out.println(temp_r1+" "+temp_e);
            answer += temp_e+answer - temp_r1;
        }
        return answer;
    }
}
/*
print(solution([[0, 10], [2, 10], [9, 10], [15, 2]]), 14)
print(solution([[0, 10], [2, 12], [9, 19], [15, 17]]), 25)
print(solution([[0, 3], [1, 9], [2, 6]]), 9)
print(solution([[0, 1]]), 1)
print(solution([[1000, 1000]]), 1000)
print(solution([[0, 1], [0, 1], [0, 1]]), 2)
print(solution([[0, 1], [0, 1], [0, 1], [0, 1]]), 2)
print(solution([[0, 1], [1000, 1000]]), 500)
print(solution([[100, 100], [1000, 1000]]), 550)
print(solution([[10, 10], [30, 10], [50, 2], [51, 2]]), 6)
print(solution([[0, 3], [1, 9], [2, 6], [30, 3]]), 7)
 */