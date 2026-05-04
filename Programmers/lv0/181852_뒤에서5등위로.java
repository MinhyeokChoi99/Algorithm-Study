import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        // 배열을 오름차순으로 정렬
        // 오름차순으로 정렬된 배열에서 idx5에서 나머지까지 꺼내기
        
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list,5,num_list.length);
        
        
        
    }
}
