package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Polino_1343 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s= br.readLine();
        String sp[] = s.split("\\.");

        int len;
        int dot=0;
        for(int i=0;i<sp.length; i++) {
            String ch = sp[i];
            len = ch.length();
            if (len % 2 == 1) {
                System.out.println(-1);
                return;
            }
            if (len >= 4) {
                int r = len / 4;
                for (int j = 0; j < r; j++) {
                    sb.append("AAAA");
                }
            }
            if (len % 4 == 2) {
                sb.append("BB");
            }
            dot += len;
            if (dot >= s.length())
                break;

            while (true) {
                if (s.charAt(dot) == 'X') break;
                else sb.append(".");

                dot++;
            }
        }
        System.out.println(sb);
    }
}
