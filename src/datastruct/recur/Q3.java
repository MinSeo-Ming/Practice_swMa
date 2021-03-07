package datastruct.recur;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] =new Integer[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(gcd(arr));
    }
    static int gcd(Integer arr[]){
        int y=arr[1],x=0;
        for(int i=0; i<arr.length; i++){
            while (y>1){
                x=y;
                y= arr[i]%y;
            }
            y=x;
        }
        return y;
    }
}
