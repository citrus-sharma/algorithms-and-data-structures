package stacksandqueues;

public class StackDemo {

    public static void main(String args[]) throws Exception {
        Stack stack = new Stack();
        stack.minStack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(6);
        stack.push(2);
        stack.push(9);
        stack.push(1);
        stack.push(1);
        stack.pop();
        //stack.pop();
        System.out.println(stack.getMin());

    }
}
