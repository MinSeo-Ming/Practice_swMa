package codeup;
import java.util.*;

public class hail {
        static ArrayList<Integer> nums ;
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            nums = new ArrayList<>();
            repeat(n);
            int end = nums.size()-1;
            print(end);
        }
        static int repeat(int n){
            nums.add(n);
            if(n==1) return 0;
            if(n%2==1)  return repeat(3*n+1);
            else return repeat(n/2);
        }
        static int print(int s){
            System.out.println(nums.get(s));
            if(s==0) return 0;
            else return print(s-1);
        }

}
