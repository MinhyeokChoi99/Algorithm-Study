package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNumber = Integer.parseInt(br.readLine());
        for(int i = 0; i < testNumber; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int nthCustomer = Integer.parseInt(st.nextToken());
            System.out.println(findRoomNumber(height, width, nthCustomer));
        }
    }
    public static int findRoomNumber(int height, int width, int nthCustomer) {
        int[] hotel = new int[height * width];
        int counter = 0;
        for(int i = 1; i <= width; i ++) {
            for(int j = 1; j <= height; j++) {
                hotel[counter] = i + j * 100;
                counter ++;
            }
        }
        return hotel[nthCustomer-1];
    }
}
