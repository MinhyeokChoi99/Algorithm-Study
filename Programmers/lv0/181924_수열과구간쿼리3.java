class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int[] query : queries) {
            int idx0 = query[0];
            int idx1 = query[1];
            
            int temp = arr[idx0];
            arr[idx0] = arr[idx1];
            arr[idx1] = temp;
        }
        return arr;
    }
}
