package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class flymetoalpha_1011 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        long dis ;
        int x,y,count;
        for(int i=0; i<num; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            dis = y-x;
            count =0;

            while (dis>distance(count)){
                count++;
            }
            System.out.println(count);
        }
    }
    static long distance(long dis){
        if(dis<3) return dis;
        if(dis%2==0) dis = sum(dis/2)*2;
        else dis = sum((dis-1)/2)*2 +((dis-1)/2+1);
        return dis;
    }
    static long sum(long n){
        return (n*(n+1)/2);
    }

}
