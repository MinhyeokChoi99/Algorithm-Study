package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8958 {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int score = 0;
            int streak = 0;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'O') {
                    streak++;
                    score += streak;
            } else {
                    streak = 0;
                }
        }
            System.out.println(score);
        }

    }
}
