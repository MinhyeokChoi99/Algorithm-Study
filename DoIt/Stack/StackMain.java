package stack;

public class StackMain {
    public static void main(String[] args) {

        Mystack ms = new Mystack(3);
        ms.push(1);
        ms.push(2);
        ms.push(3);
        System.out.println(ms.peek());
        ms.pop();
        ms.pop();
        ms.pop();
        System.out.println(ms.size());
        System.out.println(ms.isEmpty());
    }
}

