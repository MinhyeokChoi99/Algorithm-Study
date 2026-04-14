package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2231 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int result = 0;



        // 1부터 input 사이에 조건을 만족하는 결과가 있는지 찾기
        for (int j = 1; j <= input; j++) {
            if(j + getSum(j) == input) {
                result = j;
                break; // 가장 작은 조건을 만족했을 때 반복 종료
            }
        }
        System.out.println(result);



    }

    // 각 자리 숫자의 합을 구함
    private static int getSum(int input) {
        int sum = 0;
        int temp = input;
        while(temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}
