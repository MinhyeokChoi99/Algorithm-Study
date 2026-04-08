package selfstudy;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {2,4,7,10,13,15,17,19,20,24}; // 10개 
		System.out.println(SearchBinary(arr,4));

	}

	private static int SearchBinary(int[] arr, int target) {
		 int startPoint = arr.length / 2; 
		
		 for(int i = 0; i < arr.length / 2; i++) {
			 
			 if(target < arr[startPoint]) {
				 startPoint /= 2;
			 } else if (target > arr[startPoint]) {
				 startPoint = (arr.length + startPoint) / 2;
			 } else {
				 return startPoint;
			 }

		 }				
		return -1;
	}

}
