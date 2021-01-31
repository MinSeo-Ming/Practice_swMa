package codeup;

import java.util.Arrays;
import java.util.Scanner;

public class set_memu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pasta []=  new int[3];
        int ju []=  new int[2];
        for(int i=0; i<3; i++){
            pasta[i]=sc.nextInt();
        }
        for(int i=0; i<2; i++){
            ju[i]=sc.nextInt();
        }
        Arrays.sort(pasta);
        Arrays.sort(ju);
        System.out.printf(String.format("%.1f",(pasta[0]+ju[0])*1.1));
    }
}

