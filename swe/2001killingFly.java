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
            int[] flyMap = new int[N][N];
            for(int i = 0; i < N; i ++) {
            	for(int j = 0; j < N; j ++){
                	flyMap[i][j] = sc.nextInt();    
                } //forj
            }  //fori
            
            int killing = 0;
            maxKilling = 0;
            for(int i = 0; i <= N - M; i++){
                for(int j = 0; j <= N - M; j++) {
                    if(killing > maxKilling) maxKilling = killing;
                    killing = 0;
                    for(int k = 0; k < M; j++) {
                        for(int l = 0; l < M; l++) {
                            killing += fliyMap[i+k][j+l];
                        } //forl
                    } //fork
                } //forj
            } //fori
            
            system.out.println("#" + test_case + " " + maxKilling);
            
		} // for
	} // main
} // class
