import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int L = sc.nextInt();
            List<int[]> score_calorie = new ArrayList<>();
            for(int i = 0; i < N; i ++) {
                int score = sc.nextInt();
                int calorie = sc.nextInt();
                score_calorie.add(new int[] {score, calorie});
            } // 입력값 받기
        	int maxTotalScore = 0; // 매 테스트 케이스마다 최대 스코어를 찾아야 함
			for(int i = 0; i < (1 << N); i ++) { // 2^n 만큼 부분합을 봄
                int totalCalorie = 0;
                int totalScore = 0;
         
                for(int j = 0; j < N; j++) { // 1번째 2번째 ... N번째까지 포함하는지 봄
                    int thisBit = i & (1 << j);
                    if(thisBit != 0) {
                        totalScore += score_calorie.get(j)[0];
                        totalCalorie += score_calorie.get(j)[1];
                    }
                } //forj
                 if(totalCalorie <= L && totalScore > maxTotalScore) maxTotalScore = totalScore;
            } //fori   
            System.out.println("#" + test_case + " " + maxTotalScore);
		} //for
	} //main
} // class
