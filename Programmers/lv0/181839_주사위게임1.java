import java.math.*;

class Solution {
    public int solution(int a, int b) {
        boolean isA = a % 2 != 0;
        boolean isB = b % 2 != 0;
        
        if(isA && isB) {
            return a * a + b * b;
        } else if (isA || isB) {
            return (a + b) * 2;
        } else if (!isA && !isB) {
            return Math.abs(a - b);
        }
        return 0;
    }
}
