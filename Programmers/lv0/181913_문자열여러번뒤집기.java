import java.util.stream.*;
import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        
        
        
        for(int[] query : queries) {
            int start = query[0];
            int end = query[1];
            StringBuilder sb = new StringBuilder();
            
            String a = my_string.substring(0,start);
            String b = sb.append(my_string.substring(start,end + 1)).reverse().toString();
            String c = my_string.substring(end + 1);
            
            my_string = a + b + c;
        }
        
        return my_string;
    }
}
