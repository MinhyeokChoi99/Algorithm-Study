package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2292 {
    static void main(String[] args) throws IOException {
        // 1, 6(2*6-6), 12(3*6 -6), (4*6 - 6), (5*6 -6) ... (n*6 -6)
        // 다 더하면 2*6 + 3*6 + 4*6 + ... + n *6 - 6n + 1 = 6(2+3+4+...n) - 6n = 3n(n + 2) - 6n = 3n^2-3n + 1
        int distance = 1;
        int lastNumber = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        while(input > lastNumber) {
            lastNumber += distance * 6;
            distance++;
        }
        System.out.println(distance);
    }
}
