import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        
        for(int[] query : queries) {
            int[] subArr = Arrays.copyOfRange(arr,query[0],query[1] + 1);
            OptionalInt min = Arrays.stream(subArr).filter(i -> i > query[2]).min();
            if(min.isPresent()) {
                list.add(min.getAsInt());
            } else {
                list.add(-1);      
            }
            
        }
        int[] result = list.stream().mapToInt(i->i).toArray();
        
        return result;
    }
}
