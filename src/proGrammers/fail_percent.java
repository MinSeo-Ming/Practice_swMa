package proGrammers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class fail_percent {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> s = new ArrayList<Integer>();
        String tete = br.readLine();
        StringTokenizer st = new StringTokenizer(tete," ");
        int i=0;

        while(st.hasMoreTokens()){
            s.add(Integer.parseInt(st.nextToken()));
        }
        int stage[] = new int[s.size()];
        for(int j =0; j<s.size(); j++) {
            stage[j] =s.get(j);
        }
        int result [] = solution(N,stage);


        for(int j : result)
        System.out.print(j+" ");
    }
    public static int[] solution(int N, int[] stages) {
        int people = stages.length, st = 1,get;
        double percent =0;
        int[] answer = new int[N];// 답 사이즈 초기화

        Map<Integer,Double> temper = new LinkedHashMap<>(); // 내가 원한는 실패확률 계산하기 위해서 그리고 자리 기억하게 하려고 Linkedhashmap
        ArrayList<Integer> p = new ArrayList<>();
        for(int i : stages) p.add(i); //계산 편하게 하려고 Arraylist 사용함 그래서 변경함
        ArrayList<Integer> temp; // 스테이마자 제거하기 위해서 temp

        while (st<=N){
            temp = new ArrayList<Integer>();
            temp.add(st);
            p.removeAll(temp);
            get = people -p.size();
            if(get==0)percent =0;
            else percent = (double) get / people;
            temper.put(st, percent);
            people -=get;
            st++;
        }
        List<Map.Entry<Integer,Double>> list = new LinkedList<>(temper.entrySet());
        //value기준으로 정렬하기 위해서 만든 linkedlist
        Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                int cmp =(o1.getValue().compareTo(o2.getValue()))*-1;
                return cmp == 0 ? o1.getKey().compareTo(o2.getKey()) :cmp;
                //오름차순으로 하기 위해서 이렇게 함.. 만약 동일하면 키가 작은 순으로!
            }
        });
        st=0;
        for(Iterator<Map.Entry<Integer,Double>> iter = list.iterator(); iter.hasNext();){
            //정렬한 순서대로 집어넣으려고 이렇게 함..!!
            Map.Entry<Integer,Double> entry = iter.next();
            if(st>N) break;
            answer[st]= entry.getKey();
            st++;
        }

        return answer;
    }
}
/*
5
2 1 2 6 2 4 3 3

5
1 2 2 1 3
result = 32145
 */
/*
엉망으로 하긴 했는데 흠... 실패 나네 좀 수정이 필요할듯...
70.4/ 100 나중에 수정해야지...

왠지 list로 여러번 바꾸고 해서 그런거 같은데
-> map2번 바꾸는건 해결함

-> 아 헐... ㅋㅋㅋㅋㅋㅋㅋㅋㅋ 대박이네 스테이지를 다 돌아야 함...
1 6 7 13 23 24 25
 */