package inflearn;

import java.util.*;

public class many_used {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Long num = sc.nextLong();
        int temp [] = new int[10];
        while (num>0){
            int idx = (int) (num%10);
            num = num/10;
            temp[idx]++;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int t =0;
        for(int i:temp){
            map.put(t++,i);
        }
        List<Integer> key = new ArrayList<>(map.keySet());
        Collections.sort(key,(o1,o2)->(map.get(o2).compareTo(map.get(o1))));
        System.out.println(key.get(0));
    }
}
