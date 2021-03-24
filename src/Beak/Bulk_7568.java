package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bulk_7568 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int arr[][] =new int[num][2];
        for(int i=0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int order;
        for (int i=0; i<num; i++){
            order=1;
            for(int j =0; j<num; j++){
                if((arr[i][0]<arr[j][0])&&(arr[i][1]<arr[j][1]))
                    order++;
            }
            System.out.print(order+" ");
        }
    }
}
