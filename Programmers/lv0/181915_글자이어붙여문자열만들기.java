class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] charArray = my_string.toCharArray();
        for(int i = 0; i < index_list.length; i ++) {
            char c = charArray[index_list[i]];
            answer += String.valueOf(c);
        }
        return answer;
    }
}
