class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int fSize = arr1.length;
        int sSize = arr2.length;
        
        if(fSize != sSize) {
            return fSize > sSize ? 1 : -1;
        }  else {
            int sumF = 0;
            int sumS = 0;
            for(int i = 0; i < arr1.length; i++) {
                sumF += arr1[i];
                sumS += arr2[i];
            }
          return  sumF > sumS ? 1 : (sumF == sumS ? 0 : -1);
        }
        
        
    }
}
