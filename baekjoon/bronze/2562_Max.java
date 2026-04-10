package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2562 {
    public static void main(String[] args) throws IOException {
        int max;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        max = Integer.parseInt(br.readLine());
        int index = 1;
        for(int i = 0; i < 8; i++) {
            int num = Integer.parseInt(br.readLine());
           if(num > max) {
               max = num;
               index = i + 2;
           }
        }
        System.out.println(max);
        System.out.println(index);

    }
}
