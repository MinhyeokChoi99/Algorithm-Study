package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(s);

        for (int i = 1; i <= n; i++) {
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
