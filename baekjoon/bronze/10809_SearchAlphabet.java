package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        int[] solution = new int[26];
        for (int i = 0; i < 26; i++) {
            solution[i] = -1;
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (solution[str.charAt(i) - 'a'] == -1) {
                solution[str.charAt(i) - 'a'] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(solution[i] + " ");
        }

    }
}
