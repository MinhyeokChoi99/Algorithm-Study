package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ3052 {
    static void main(String[] args) throws IOException {
        HashSet<Integer> integerHashSet = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            int result = Integer.parseInt(br.readLine()) % 42;
            integerHashSet.add(result);
        }
        System.out.println(integerHashSet.size());
    }
}
