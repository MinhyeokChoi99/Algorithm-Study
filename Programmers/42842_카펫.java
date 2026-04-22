
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int brown, int yellow) {
    	
    	// 노란색의 모양을 먼저 잡음
    	// brown24 yellow24 에서 yellow 는 (24 1) (12 2) (8 3) (6 4)
    	// 각각의 배열이 맞는지 검증 수행 brown으로 감쌀 수 있을지
    	// 1. 26 + 26 + 1 + 1 / 14 + 14 + 2 + 2 / 10 + 10 + 3 + 3 / 8 + 8 + 4 + 4
    	// 위 조건에 맞는 answer return
    	int[] answer = {};
    	List<int[]>yellows = new ArrayList<>();
    	// 1. yellow 경우의 수 구하기
    	for(int i = 1; i * i <= yellow; i++) {
    		//나누어 떨어지면 가로세로 배열에 추가
    		if(yellow / i < i) {
    			continue;
    		}
   	
    		if(yellow % i == 0 ) {
    			yellows.add(new int[]{yellow / i, i});
    		}
    	}
    	
    	//2.각각의 배열 검증
    	for (int[] y : yellows) {
			if((y[0] + 2) * 2 + y[1] * 2 == brown) {
				answer = new int[] {(y[0] + 2),y[1]+2};
			}
    		
		}
    	
        
        return answer;
    }
}
