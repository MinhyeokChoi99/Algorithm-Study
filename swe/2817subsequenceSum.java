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
			int K = sc.nextInt();
            int[] nums = new int[N];
            for(int i = 0; i < N; i ++) {
            	nums[i] = sc.nextInt();   
            } // fori
            
            int count = 0;
            
            for(int i = 0; i < (1 << N); i ++){
                int sum = 0;
                
                for(int j = 0; j < N; j++) {
                	if((i & (1 << j)) != 0) {
                        sum += nums[j];
                    }
                } //forj     
                if(sum == K) count++;
            } //fori
            
            System.out.println("#" + test_case + " " + count);

		} //test_case
	} //main
} //class

/*
O(N * 2^N)
N의 최대 20이니 20 * 2^20 -> 2천만
통과가능
*/
