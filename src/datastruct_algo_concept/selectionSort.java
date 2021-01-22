package datastruct_algo_concept;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int set[] =new int[10];
        for(int i=0; i<10; i++){
            set[i]= sc.nextInt();
        }
        int sort [] = set.clone();
        int min,temp;
        for(int i=0; i<sort.length-1; i++){
            min =i;
            for(int j=i+1; j<sort.length; j++){
                if(sort[j]<sort[min])
                    min=j;
            }
            swap(sort,min,i);
        }
        System.out.println(Arrays.toString(sort));
    }
    static void swap(int[] temp,int a, int b){
        int t = temp[b];
        temp[b] =temp[a];
        temp[a] =t;
    }
}
