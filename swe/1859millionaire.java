import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;
import java.util.stream.*;

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
            List<Integer> saleList  = new ArrayList<>();
            for(int i = 0; i < N; i ++) {
                saleList.add(sc.nextInt());
            } //for 입력값 받기
            
            long revenue = 0; // 수입
            int maxSalePrice = 0; // 최대 매매가
            for(int i = N - 1; i >= 0; i --) {
				int todayPrice = saleList.get(i);
                if(todayPrice > maxSalePrice) maxSalePrice = todayPrice; // 최대값 갱신
                
                if(todayPrice < maxSalePrice) revenue += (long)maxSalePrice - (long)todayPrice;
            } // for
            
            System.out.println("#" + test_case + " " + revenue);
		
		} // for
	}
}

/*
1859. 백만 장자 프로젝트

사는건 가장비쌀때보다 쌀때만
파는건 가장 비쌀때 팔면 된다
여러번 팔수가있음 -> 뒤에서부터 읽는다

이익 = 가장비쌀때 매매가 - 현재 보고 있는것의 매매가

매매가를 나타내는 자연수 N개가 1,000,000개이니 반복없이 한번만 탐색 -> 시간복잡도 O(n)
*/
