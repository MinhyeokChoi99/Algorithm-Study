package que;

import java.util.Arrays;

public class RingBufferMain {
	public static void main(String[] args) {
		
		RingBuffer r = new RingBuffer(5);
		
		r.enque(1);
		System.out.println(Arrays.toString(r.buffer));
		r.enque(2);
		System.out.println(Arrays.toString(r.buffer));
		r.enque(3);
		System.out.println(Arrays.toString(r.buffer));
		r.enque(4);
		System.out.println(Arrays.toString(r.buffer));
		r.enque(5);
		System.out.println(Arrays.toString(r.buffer));
		System.out.println(r.getSize());
		r.deque();
		System.out.println(r.getSize());
		System.out.println(Arrays.toString(r.buffer));
		r.deque();
		System.out.println(r.getSize());
		System.out.println(Arrays.toString(r.buffer));
		r.deque();
		System.out.println(r.getSize());
		System.out.println(Arrays.toString(r.buffer));
		
	
		
		
	}

}
