class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        int a = 0;
        for(int i = 0; i < nums.length; i = i + 2) {
            result[i] = nums[a]; 
            a++;
        }
        
        a = 0;

        for(int i = 1; i < nums.length; i = i + 2) {
            result[i] = nums[a + n]; 
            a++;
        }

        return result;



    }
}
