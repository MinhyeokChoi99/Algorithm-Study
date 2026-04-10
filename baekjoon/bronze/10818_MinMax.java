package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max;
        int min;
        max = min =Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            int target = Integer.parseInt(st.nextToken());
            if(target > max) {
                max = target;
            }
            if(target < min) {
                min = target;
            }
        }
        System.out.println(min + " " + max);



    }
}
