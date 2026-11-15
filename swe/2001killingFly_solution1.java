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
            int[][] flyMap = new int[N][N];
            for(int i = 0; i < N; i ++) {
            	for(int j = 0; j < N; j ++){
                	flyMap[i][j] = sc.nextInt();    
                } //forj
            }  //fori
            
            int killing = 0;
            int maxKilling = 0;
            for(int i = 0; i <= N - M; i++){
                for(int j = 0; j <= N - M; j++) {
                    
                    for(int k = 0; k < M; k++) {
                        for(int l = 0; l < M; l++) {
                            killing += flyMap[i+k][j+l];
                        } //forl
                    } //fork
                    if(killing > maxKilling) maxKilling = killing;
                    killing = 0;
                } //forj
            } //fori
            
            System.out.println("#" + test_case + " " + maxKilling);
            
		} // for
	} // main
} // class

/*
N은 5이상 15이하이다 -> 최대 15 * 15 -> 225칸
M은 2 이상 N이하이다
각 영영의 파리 갯수는 30 이하이다 225 * 30 -> 10,000 이하

파리채 크기에 따라 완전 탐색
최악의 경우 (N -M) * (N - M) 번을 M * M 번 탐색해야함

N이 15이하이기 때문에 N^4은 무리가 없음
*/
