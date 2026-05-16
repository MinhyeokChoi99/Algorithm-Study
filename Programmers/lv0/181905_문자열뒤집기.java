import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        
        String a = my_string.substring(0,s);
        String b = sb.append(my_string.substring(s,e + 1)).reverse().toString();
        String c = my_string.substring(e + 1);
        
        return a + b + c;
    }
}
