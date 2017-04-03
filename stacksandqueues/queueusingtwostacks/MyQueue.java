package stacksandqueues.queueusingtwostacks;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack = new Stack<>();

    public void enqueue(int item) {
        stack.add(item);
    }

    public int dequeue() {
        Stack<Integer> stackReverse = new Stack<>();
        while(!stack.empty()) {
            stackReverse.add(stack.pop());
        }
        int top = stackReverse.pop();
        while(!stackReverse.empty()) {
            stack.add(stackReverse.pop());
        }
        return top;
    }

}
