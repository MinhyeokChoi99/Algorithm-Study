package que;

import java.util.Arrays;

public class QueMain {
	
	public static void main(String[] args) {
		
		Que myQue = new Que(5);
		myQue.enqueue(1);
		myQue.enqueue(2);
		myQue.enqueue(3);
		myQue.enqueue(4);
		myQue.enqueue(5);
		System.out.println(myQue.dequeue());
		System.out.println(Arrays.toString(myQue.que));
		
		
	
		
		
		
		
		
		
	}

}
