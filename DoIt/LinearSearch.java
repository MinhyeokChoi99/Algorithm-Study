package selfstudy;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,5,4,2};
		System.out.println(linearSearch(arr,7));
		
		
	} //main
	
	public static int linearSearch(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
			
		}
}
