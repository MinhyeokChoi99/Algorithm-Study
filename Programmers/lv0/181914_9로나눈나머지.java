class Solution {
    public int solution(String number) {
        int sum = 0;
        char[] chars = number.toCharArray();
        for(int i = 0; i < chars.length; i ++) {
            sum += Integer.valueOf(chars[i] - '0');
        }
        
        return sum % 9;
        
    }
}
