package stack;

public class Mystack {
    int[] stk;
    int capacity;
    int size;



    public Mystack(int capacity) {
        this.capacity = capacity;
        stk = new int[capacity];
    }

    public void push(int e) {
        if(size == capacity) {
            throw new RuntimeException("스택이 가득 찼습니다.");
        }
            System.out.println(e + "을 넣습니다");
            stk[size] = e;
            size++;
    }

    public int pop() {
        if(size == 0) {
            throw new RuntimeException("스택이 비어있습니다.");
        }
        size--;
        System.out.println(stk[size] + "을 꺼냅니다.");
        return stk[size];
    }

    public int peek() {
        if(size == 0) {
            throw new RuntimeException("스택이 비어있습니다.");
        }
        return stk[size-1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
