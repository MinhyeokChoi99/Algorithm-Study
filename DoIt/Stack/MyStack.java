package stack;

public class Mystack {
	
	
	int[] stk;
	int capacity;
	int size;
	int pointer;
	
	
	public Mystack(int capacity) {
		this.capacity = capacity;
		stk = new int[capacity];
	}

	public void push(int e) {
		if(size == stk.length) {
			System.out.println("공간 부족");
			return;
		}
		System.out.println(e + "을 넣습니다");
		stk[pointer] = e;
		size++;
		pointer++;
	}
	
	public int pop() {
		return 0;
	}
	
	public int peek() {
		return stk[size];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size == 0) ? true : false;
	}
	
	
	
	
}
