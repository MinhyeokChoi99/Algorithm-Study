package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringTokenizer s = new StringTokenizer("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            s = new StringTokenizer(br.readLine(), " ");
            sb.append((Integer.parseInt(s.nextToken()) + Integer.parseInt(s.nextToken()))).append('\n');
        }
        System.out.println(sb);
    }
}
