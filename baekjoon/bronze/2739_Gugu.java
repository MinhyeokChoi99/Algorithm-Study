package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2739 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int input = Integer.parseInt(s);

        for (int i = 1; i <= 9 ; i++) {
            System.out.println(input + " * " + i + " = " + (input * i));
        }
    }
}
