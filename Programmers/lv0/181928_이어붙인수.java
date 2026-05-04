class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        
        for(int i : num_list) {
            if(i % 2 != 0) {
                odd += i + "";
            } else {
                even += i + "";
            }
        }
        int oddN = Integer.valueOf(odd);
        int evenN = Integer.valueOf(even);
        
        return oddN + evenN;
    }
}
