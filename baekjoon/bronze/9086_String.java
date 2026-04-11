package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9086 {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        // for (int i = 0; i < number; i++) {
        //     String str = br.readLine();
        //     String first = String.valueOf(str.charAt(0));
        //     String second = String.valueOf(str.charAt(str.length() - 1));
        //     System.out.println(first + second);
        // }
        for (int i = 0; i < number; i++) {
            String str = br.readLine();
            System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
        }
    }
}
