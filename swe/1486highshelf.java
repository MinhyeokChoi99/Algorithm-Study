import java.util.*;


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
            int B = sc.nextInt();
            int[] staff = new int[N];
            for(int i = 0; i < N; i++) {
                staff[i] = sc.nextInt();
            } //fori 
            
            /* ----- 입력값 받기----- */
            int answer = Integer.MAX_VALUE;
            for(int i = 0; i < (1 << N); i++) {
                int sum = 0;
                for(int j = 0; j < N; j++) {
                	if((i & (1 << j )) != 0) {
                    sum += staff[j];
                    if(sum >= B) answer = Math.min(answer , sum - B);
                    }
                } //forj
            } // fori
            System.out.println("#" + test_case + " " + answer);
		} // for test_case
	} // main
} // class
/*
O(2^n)
*/
