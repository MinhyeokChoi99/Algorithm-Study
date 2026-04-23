package f;

import java.util.Arrays;
import java.util.Scanner;

public class CombPractice {
	
	static int[] arr;
	static int[] output;
	public static void main(String[] args) {
		//조합 구하기(start index 방법)
		arr = new int[] {1,2,3,4,5}; // 원본 배열
		output = new int[3]; // 뽑은 결과를 저장하는 배열 (3개만큼 뽑겠다)
		
		comb(0,0,3);
	}
	
	public static void comb(int depth, int start,int r) {
		if(depth == r) {
			System.out.println(Arrays.toString(output));
			return;
		}
		
		for(int i = start; i < arr.length; i++) {
			output[depth] = arr[i];
			comb(depth + 1, i + 1, 3);
		}
	}
	
}
