class Solution {
    public int solution(String myString, String pat) {
        String swapped = "";
        
        char[] chars = myString.toCharArray();
        for(char c : chars) {
            swapped += c == 'A' ? "B" : "A";
        }
        
        return swapped.contains(pat) ? 1 : 0; 
    }
}
