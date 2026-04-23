// 1. 조합 순열 자유롭게 사용할 수 있어야함
// 2. 반복문을 통해서 조합 구현도 필요하면 할 수 있어야함
// 3. 관련 문제 BOJ2407


package f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class haha {
	static int N;
	static int[][] ability;
	static int[] teamA;
	static boolean[] player;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); //게임에 참여하는 참여자 수
		ability = new int[N][N];
		teamA = new int[N / 2];
		player = new boolean[N];
		
		
		// 입력값
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				ability[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// N / 2명씩 짝이루기
		comb(0, 0, N / 2);
		
		System.out.println(min);

	}
	public static void comb(int depth, int start,int r) {
		if(depth == r) {
			// 1,2,5,7 같은팀 0,3,4,6 같은팀 output = {1,2,5,7}
			int sumA = 0;
			int sumB = 0;
			for(int i = 0; i < N; i++) {
				for(int j = i + 1; j < N; j++) {
					if(player[i] && player[j]) {
						sumA += ability[i][j] + ability[j][i];
					} else if(!player[i] && !player[j]) {
						sumB += ability[i][j] + ability[j][i];
					}
				}
			}
			min = Math.min(min, Math.abs(sumA - sumB));
			return;
		}		
		
		for(int i = start; i < N; i ++) {
			player[i] = true;
			comb(depth + 1, i + 1, r);
			player[i] = false;
		}
		
	}
}
