package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2675 {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());

        for (int i = 0; i < iter; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int loop = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < loop; k++) {
                    sb.append(str.charAt(j) + "");
                }
            }
            System.out.println(sb.toString());

        }

    }
}
