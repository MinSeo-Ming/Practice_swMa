package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class meeting_room {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int number = Integer.parseInt(br.readLine());
        int time[][] = new int[number][2];
        int cp = number;
        int i=0;
        while (number-->0){
            st = new StringTokenizer(br.readLine());
            time[i][0] =Integer.parseInt(st.nextToken());
            time[i++][1] =Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]== o2[1]){
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });
        int cnt =0, prev_ed=0;
        for(i=0; i<cp; i++){
            if(prev_ed <=time[i][0]){
                prev_ed = time[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
