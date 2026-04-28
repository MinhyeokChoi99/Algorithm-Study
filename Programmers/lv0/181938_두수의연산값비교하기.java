class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int f = Integer.parseInt(a + "" + b);
        int s = 2 * a * b;
        return f > s ? f : s;
    }
}
