package f;

import java.util.Scanner;

public class CombPractice {
	static int count = 0;
	static int N;
	static int M;
	static boolean[] selected;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// nCm을 출력하기 (n개 중에 m개 중복없이 선택)
		N = sc.nextInt();
		M = sc.nextInt();
		
		
		comb(0,0,M);
		System.out.println(count);
	}
	
	public static void comb(int depth, int start, int m) {
		if(depth == m) {
			count++;
			return;
		}
		
		for(int i = start; i < N; i ++) {
//			selected[i] = true;
			comb(depth + 1, i + 1, m);
//			selected[i] = false;
		}
	}

}
