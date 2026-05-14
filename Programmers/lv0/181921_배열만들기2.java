import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        
        List<Integer> result = new ArrayList<>();
        
        for(int i = l ; i <= r; i ++) {
            String target = String.valueOf(i);
            
            char[] charArray = target.toCharArray();
            
            boolean five = true;
            
            for(char c : charArray) {
                if(c != '0' && c != '5') {
                    five = false;
                    break;
                }
                
            }
            
            if(five) {
                result.add(i);
            }
            
        }
        if(result.isEmpty()) {
            return new int[] {-1};
        }
        
        int[] arr = result.stream().mapToInt(i -> i).toArray();
        
        return arr;
    }
}
