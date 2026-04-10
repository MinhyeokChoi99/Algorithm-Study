package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String s = Integer.toString(a * b * c); // a * b * c를 문자열로 저장

        int[] arr = new int[10]; // 각 자리 수를 카운트하기 위해 선언 arr[0]부터~arr[9]까지 각각 0의횟수 1의횟수... 9의횟수

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - '0']++;
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }




    }
}
