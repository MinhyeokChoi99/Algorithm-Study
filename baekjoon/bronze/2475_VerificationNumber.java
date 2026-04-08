package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int a = (int) Math.pow(Integer.parseInt(st.nextToken()),2);
        int b = (int) Math.pow(Integer.parseInt(st.nextToken()),2);
        int c = (int) Math.pow(Integer.parseInt(st.nextToken()),2);
        int d = (int) Math.pow(Integer.parseInt(st.nextToken()),2);
        int e = (int) Math.pow(Integer.parseInt(st.nextToken()),2);
        System.out.println((a + b + c + d + e) % 10);
    }
}
