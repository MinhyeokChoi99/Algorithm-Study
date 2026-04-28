import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
    	
        int answer = 1;
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for(String[] cloth : clothes) {
            String type = cloth[1]; // 종류

            hashMap.put(type, hashMap.getOrDefault(type, 0) + 1);
        }
        
        
        for (int count : hashMap.values()) {
			answer = answer * (count +1);
		}
    
       
        
      
        
        
        return answer -1;
    }
}
