import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
    	int current = 0; // 현재 다리의 무게
    	int n = 0; // 현재 다리를 건넌 트럭의 수
        int m= 0;
        // 다리를 만들어서 0으로 초기화
        Deque<Integer> bridge = new ArrayDeque<>();   
        for(int i = 0; i < bridge_length; i ++) {
        	bridge.offer(0);
        }
        
        // 앞으로 이동
        while(n < truck_weights.length) {
        	int poll = bridge.poll();
        	current -= poll;
        	answer++;
        	
        	if(poll != 0) {
        		n++;
        	}
        	
        	if(m <truck_weights.length&& current + truck_weights[m] <= weight) {
        		bridge.offer(truck_weights[m]);
                current += truck_weights[m];
        		m++;
        	} else {
                bridge.offer(0);
            }
        }
       
        return answer;
    }
}
