import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        
        for(String a : intStrs) {
            int sol = Integer.valueOf(a.substring(s,s+l));
            if(sol > k) result.add(sol);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
