import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        
    	// 각각의 모든 값들을 오름차순으로 정렬
    	for(int i = 0; i < sizes.length; i++) {
    		Arrays.sort(sizes[i]);
    	}
    	
    	// 각각의 그룹에서 최대값 구하기
    	int leftMax = Integer.MIN_VALUE;
    	int rightMax = Integer.MIN_VALUE;
    	for(int i = 0; i < sizes.length; i++) {
    		if(sizes[i][0] > leftMax) {
    			leftMax = sizes[i][0];
    		}
    		if(sizes[i][1] > rightMax) {
    			rightMax = sizes[i][1];
    		}
    	}
    	
    	int answer = leftMax * rightMax;
    	return answer;
    }
}
