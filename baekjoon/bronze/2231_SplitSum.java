package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2231 {
    static void main(String[] args) throws IOException {
//        int n = 123; // 예시
//        int splitSum = n + (n / 100) + (n % 100 / 10)  + (n % 100 % 10); // splitSum 이 주어졌을 때 어떻게 n을 구할것이냐?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int result = 0;
        for (int j = 1; j <= input; j++) {
            if(j + (j / 100) + (j % 100 / 10)  + (j % 100 % 10) == input) {
                result = j;
                break;
            }
        }
        System.out.println(result);



    }
}
