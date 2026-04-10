package que;

public class RingBuffer {
	
	int[] buffer; // 저장용
	int head; // 맨 앞의 포인터 deque용
	int tail; // 맨 뒤의 포인터 enque용
	int capacity; // 용량
	int size; // element 수
	
	RingBuffer(int capacity) {
		this.capacity = capacity;
		buffer = new int[capacity];
	}
	
	public void enque(int e) {
		if(size == capacity) {
			System.out.println("full");
			return;
		}
		buffer[tail] = e;
		tail = (tail + 1) % capacity;
		
		size++;
	}
	
	public int deque() {
		if(size == 0) {
			System.out.println("empty");
			return 0;
		}
		int value = buffer[head];
		buffer[head] = 0;
		head = (head+1) % capacity;
		size--;
		return value;
	}
	
	public int getSize() {
		return size;
	}
	
	

}
