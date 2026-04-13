package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4153 {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean isContinue = true;
        while(isContinue) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if (a == 0 ) {
                isContinue = false;
                break;
            }
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int max = Math.max(Math.max(a,b),c);
            if(Math.pow(max,2) == Math.pow(a,2) + Math.pow(b,2) || Math.pow(max,2) == Math.pow(a,2) + Math.pow(c,2)
                    || Math.pow(max,2) == Math.pow(b,2) + Math.pow(c,2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
