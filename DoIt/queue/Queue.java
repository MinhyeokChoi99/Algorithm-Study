package que;

public class Que {
	
	int[] que;
	int capacity;
	int size;
	
	Que(int capacity) {
		this.capacity = capacity;
		que = new int[capacity];
	}
	
	public void enqueue(int e) {
		if(size == capacity) {
			System.out.println("full");
			return;
		}
		shiftToRight();
		que[0] = e;
		size++;
	}
	
	public int dequeue() {
		if (size == 0) {
			System.out.println("Size - 0");
			return -1;
		}
		int deque = que[0];
		shiftToLeft();
		size--;
		return deque;
	}
	
	public void shiftToLeft(){
		for(int i = 0; i < size - 1; i++) {
			
			que[i] = que[i+1];
		}
		que[size -1] = 0;
	}
	
	public void shiftToRight() {
		
		for (int i = size; i > 0; i--) {
			if(i == 0 || i==capacity) {
				break;
			}
			que[i] = que[i-1];
			}
		
	}
}
