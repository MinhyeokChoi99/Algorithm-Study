package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ3003 {
    static void main(String[] args) throws IOException {
        int[] arr = new int[6];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 6; i++) {
            int n = Integer.parseInt(st.nextToken());
            arr[i] = n;
        }

        int[] result = new int[6];

        result[0] = 1 - arr[0];
        result[1] = 1 - arr[1];
        result[2] = 2 - arr[2];
        result[3] = 2 - arr[3];
        result[4] = 2 - arr[4];
        result[5] = 8 - arr[5];

        StringBuilder sb = new StringBuilder();
        for (int i : result) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);


    }
}
