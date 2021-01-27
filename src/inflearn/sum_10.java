package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sum_10 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int sum =0;
        int aws=0;

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            int temp_sum=0;
            int temp = Integer.parseInt(st.nextToken());
            int aws_temp= temp;
            while (temp>10){
                temp_sum+= temp%10;
                temp =temp/10;
            }
            temp_sum+=temp;
            if(sum<=temp_sum) {
                aws = aws_temp;
                if(aws<aws_temp) aws=aws_temp;
                sum = temp_sum;
            }
        }
        System.out.println(aws);
    }
}
