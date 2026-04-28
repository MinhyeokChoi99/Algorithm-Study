import java.util.Arrays;

class Solution {
    public int[] solution(int n, long left, long right) {
//         int[] answer = {};
        
//         // 2차원 배열 생성
// 		int[][] arr = new int[n][n];
// 		int count = 1;
// 		for(int i = 0; i < n; i ++) {
// 			int plus = 1;
// 			for(int j = 0; j < n; j++) {
// 				if(j < count) {
// 					arr[i][j] = count;
// 				} else {
// 					arr[i][j] = count + plus;
// 					plus++;
// 				}
// 			}
// 			plus = 1;
// 			count++;
// 	  } 
        
//         //2차원 배열 -> 1차원배열
// 			count = 0;
// 			int[] newArr = new int[n * n];
// 			for(int i = 0; i < arr.length; i++) {
// 				for(int j = 0; j < arr.length; j++) {
// 					newArr[count] = arr[i][j];
// 					count++;
// 				}
// 			}
        
//         newArr = slice(newArr,(int)left,(int)right);
        
//         answer = newArr;
//         return answer;
        int[] answer = new int[(int)(right - left + 1)];
		
		for(long i = left; i <= right; i ++) {
			int row = (int)(i / n);
			int column = (int)(i % n);
			answer[(int)(i - left)] = Math.max(row, column) + 1;
		}
        return answer;
        
        
    }
    
	// public static int[] slice(int[]arr, int left, int right) {
	// 	return Arrays.copyOfRange(arr, left, right + 1);
	// }
}
