package selfstudy;

import java.util.Arrays;

public class Bubble {
	
	public static void main(String[] args) {
		int arr[] = {1,5,4,3,2,7,8,9,10,14,15,46,2,5};
		int c = arr.length -1;
		while(c > 0) {
			for(int i = 0; i < arr.length - 1; i++) {
				if(i == c) {
					break;
				}
				if (arr[i] > arr[i+1]) {
					swap(arr,i,i+1);
				}
			}
			c--;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	
}
