package stacksandqueues.queuereversal;

import stacksandqueues.Stack;
import stacksandqueues.linkedqueue.LinkedQueue;

public class QueueReversal {
    private Stack stack = new Stack();

    public void reverseQueue(LinkedQueue queue) {
        if(!queue.isEmpty()) {
            int val = queue.dequeue();
            stack.push(val);
            reverseQueue(queue);
        }
        
    }
}
