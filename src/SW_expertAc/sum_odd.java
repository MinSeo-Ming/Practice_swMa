package SW_expertAc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sum_odd {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int repeat = Integer.parseInt(br.readLine());
        int result=0;
        int temp;

        for(int i=1; i<=repeat; i++){
            result=0;
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                temp = Integer.parseInt(st.nextToken());
                if(temp%2==1){
                    result+=temp;
                }
            }
            System.out.println("#"+i+" "+result);
        }
    }
}
