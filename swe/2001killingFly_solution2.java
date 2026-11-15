import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int M = sc.nextInt();
            
            int[][] prefixSum = new int[N+1][N+1];
            for(int i = 1 ; i <= N; i ++){
                for(int j = 1; j <= N; j++){
                    prefixSum[i][j] = prefixSum[i][j-1] +  prefixSum[i-1][j] - prefixSum[i-1][j-1] + sc.nextInt();
                } //forj
            } //fori 구간합 구하기
            
            int maxKilling = 0;
            for(int i = 0; i <= N - M; i++){
                for(int j = 0; j <= N - M; j++) {
                    int killing = prefixSum[i+M][j+M] - prefixSum[i + M][j] - prefixSum[i][j + M] + prefixSum[i][j]; 
                    if(killing > maxKilling) maxKilling = killing;
                } //forj
            } //fori
            
            System.out.println("#" + test_case + " " + maxKilling);
            
		} // for
	} // main
} // class

/*
2001. 파리 퇴치
구간합을 통하여 더 간단히 풀이할 수 있음
기존의 O(n^4)에서 n^2 을 1로 없애 O(n^2)으로 바뀜
*/
