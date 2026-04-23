//순열 구하기(visited 방법)

package f;

import java.util.Arrays;
import java.util.Scanner;

public class CombPractice {
	static boolean[] visited;
	static int[] arr;
	static int[] output;
	public static void main(String[] args) {
		//순열 구하기(visited 방법)
		arr = new int[] {1,2,3,4,5}; // 원본 배열
		visited = new boolean[arr.length]; // 선택했는지 확인하는 배열
		output = new int[3]; // 뽑은 결과를 저장하는 배열 (3개만큼 뽑겠다)
		
		perm(0,3); // perm(depth, r) 원본배열에서 r개만큼 뽑겠다 
	}
	
	public static void perm(int depth, int r) {
		if(depth == r) { 
			System.out.println(Arrays.toString(output));
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(visited[i]) {
				continue;
			} // 만약 i번째 요소를 이미 선택했으면 다음거를 탐색
			visited[i] = true; //선택된 요소를 사용했다고 체크
			output[depth] = arr[i]; // depth번째에 넣기
			perm(depth + 1, 3); // depth +1 번째 탐색 시작
			visited[i] = false; // 선택하지 않았다고 되돌리기
		}
	}
}
