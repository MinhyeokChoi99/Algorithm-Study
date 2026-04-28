import java.util.HashSet;


class Solution {
    public int solution(int[] nums) {
        int answer = 0;
       
        int n = nums.length;
     
        HashSet<Integer> hashSet = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
        	hashSet.add(nums[i]);
        }
        
        if(hashSet.size() >= n / 2) {
        	return n / 2;
        } else {
        	return hashSet.size();
        }
        
       
    }
}
