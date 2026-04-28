class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        // 4가지 경우
        
        if(ineq.equals("<")) {
            if(eq.equals("=")) {
                return n <= m ? 1 : 0;
            } else {
                return n < m ? 1 : 0;
            }
        } else {
            if(eq.equals("=")) {
                return n >= m ? 1 : 0;
            } else {
                return n > m  ? 1 : 0;
            }
        }
       
    }
}
