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
            int B = sc.nextInt();
            int W = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();            
            
            int answer = Integer.MIN_VALUE;
            for(int i = 0; i <= B; i ++) {
                if(i < B - W) continue;
                int sum = X * i + (W - B + i)* Y + 2 * (B - i) * Z;
                answer = Math.max(answer,sum);
            }
            System.out.println(answer);
		} //test
	} //main
} // class

/*
시간 복잡도 O(B)
*/
