import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> temp = new ArrayList<>();
        
        
        for(int i = 0; i < arr.length; i ++) {
            for(int j = 0; j < arr[i]; j ++) {
                temp.add(arr[i]);
            }
        }
        
        int[] answer = temp.stream().mapToInt(i -> i).toArray();
        return answer;
        
        
       
    }
}
