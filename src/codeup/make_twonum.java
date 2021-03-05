package codeup;

import java.util.Scanner;

public class make_twonum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int zero =1, one =1,temp;
        if(n>=1){
            for(int i=1; i<n; i++){
                temp=zero;
                zero = one;
                one +=temp;
            }
        }
        System.out.println(zero+one);
    }
}
