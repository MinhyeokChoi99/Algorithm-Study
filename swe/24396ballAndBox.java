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
            for(int i = 0; i < B; i ++) {
                int sum = X * i + W * Y + (B - i) * Z;
                answer = Math.max(answer,sum);
            }
            System.out.println(answer);
		} //test
	} //main
} // class
