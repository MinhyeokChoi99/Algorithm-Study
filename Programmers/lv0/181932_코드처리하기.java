class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;
        
        for(int i = 0; i < code.length(); i ++) {
            if(!mode) {
                
                if(code.charAt(i) != '1' && i % 2 == 0) {
                    answer += String.valueOf(code.charAt(i));
                }
                if(code.charAt(i) == '1') {
                    mode = true;
                }
                
            } else {
                if(code.charAt(i) != '1' && i % 2 == 1) {
                    answer += String.valueOf(code.charAt(i));
                }
                if(code.charAt(i) == '1') {
                    mode = false;
                }
                
            }
        }
        
        if(answer.equals("")) {
                return "EMPTY";
            }
            return answer;
        
        
        
    }
}
