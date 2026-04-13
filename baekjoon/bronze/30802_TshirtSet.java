package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_30802 {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 1번째 줄 읽기


        StringTokenizer st = new StringTokenizer(br.readLine()); // 두 번째 줄 읽고 size 배열에 집어넣기
        int[] size = new int[6];
        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()); // 세 번째 줄 읽고 각각 t와 p설정
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        // 티셔츠 구하기
        int resultT = 0;
        for (int i = 0; i < size.length; i++) {
            resultT += (size[i] + t - 1) / t;
        }
        System.out.println(resultT);
        // 펜 구하기
        System.out.println(n / p + " " + n % p);

    }
}
