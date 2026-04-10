package recursion;

public class Factorial {
	public static void main(String[] args) {
		
		System.out.println(factorial(5));
	}
	
	
	// 재귀함수 
	// 종료조건이 존재해야함(그렇지 않으면 자기자신을 끝없이 호출)
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * factorial(n-1);
	}

}
