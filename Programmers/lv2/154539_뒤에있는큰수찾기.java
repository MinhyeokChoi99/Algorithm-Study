import java.util.*;

class Solution {
    // 주식가격? 이랑 똑같은 문제라고 생각
    public int[] solution(int[] numbers) {
        // 결과를 담을 배열 생성
        int[] result = new int[numbers.length];
        //작업을 시행할 스택 생성
        Deque<int[]> q = new ArrayDeque<>();
        
        //앞에서부터 하나씩 확인하며 한 번 순회를 마쳤을 때 결과를 반환
        for(int i = 0; i < numbers.length; i ++) {
            // 스택이 비었는지 확인하고 스택 맨 위의 값과 크기 비교
            while(!q.isEmpty() && q.peek()[0] < numbers[i]) {
                int[] cur = q.poll();
                result[cur[1]] = numbers[i];
            }
            // 자기자신을 스택에 추가
            q.push(new int[]{numbers[i],i});
        }
        
        // 끝까지 남은 값들 스택에서 초기화
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            result[cur[1]] = -1;
        }
        
        return result;
        
       
        
    }
}
