import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i ++) {
            if (arr[i] % divisor == 0 ) {
                set.add(arr[i]);
            }
        }
        
        if(set.isEmpty()) {
            return new int[]{-1};
        }
        
        answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}
