package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2753 {
    
    public static int checkLeapYear(int year) {
        if (year % 4 == 0) {
            if((year % 100) != 0) {
                return 1;
            } else if((year % 400) == 0 ) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int year = Integer.parseInt(s);
        System.out.println(checkLeapYear(year));
    }
}
