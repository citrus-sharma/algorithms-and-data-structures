package stacksandqueues.stackreversal;

import stacksandqueues.Stack;
import stacksandqueues.linkedqueue.LinkedQueue;

public class StackReversal {
    private LinkedQueue linkedQueue = new LinkedQueue();

    public void reverseStack(Stack stack) throws Exception{
        if(!stack.isEmpty()) {
            int val = stack.pop().getData();
            linkedQueue.enqueue(val);
            reverseStack(stack);
        }
        if(!linkedQueue.isEmpty()) {
            stack.push(linkedQueue.dequeue());
        }
    }
}
