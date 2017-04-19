package stacksandqueues.queuereversal.reversalusingtempqueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReversalWithTempQueue {
    private Queue<Integer> tempQueue = new LinkedList<>();

    public void reverseQueueRecursively(Queue<Integer> queue) {
        reverseQueueRecursivelyP(queue);
        while(!tempQueue.isEmpty()) {
            queue.add(tempQueue.remove());
        }
    }

    public void reverseQueueRecursivelyP(Queue<Integer> queue) {
        if(!queue.isEmpty()) {
            int num = queue.remove();
            reverseQueueRecursivelyP(queue);
            tempQueue.add(num);
        }
    }
}
