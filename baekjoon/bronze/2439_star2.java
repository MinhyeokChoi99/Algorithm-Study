package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int empty = n-1;

        for(int i = 0; i < n; i++) {
            StringBuilder st = new StringBuilder();
            System.out.println(st.append(" ".repeat(empty)).append("*".repeat(n-empty)));
            empty--;
        }



    }
}
