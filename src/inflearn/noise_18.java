package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class noise_18 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int aws =0;
        int pre =0;

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            int cal = Integer.parseInt(st.nextToken());
            if(cal>m){
                pre=cal;
                aws++;
            }
            else{
                pre=0;

            }
        }
        if(aws==0) System.out.println(-1);
        else System.out.println(aws);
    }
}
