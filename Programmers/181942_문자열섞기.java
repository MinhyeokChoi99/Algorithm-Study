import java.util.LinkedList;
import java.util.List;

class Solution {
    public String solution(String str1, String str2) {
   
        
		List<Character> list1 = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for (Character character : str1.toCharArray()) {
			list1.add(character);
		}
		
		List<Character> list2 = new LinkedList<>();
		for (Character character : str2.toCharArray()) {
			list2.add(character);
		}
		
		while(!(list1.isEmpty() && list2.isEmpty())) {
			sb.append(list1.remove(0));
			sb.append(list2.remove(0));
		}
		
		return sb.toString();
}

   
}
