package stacksandqueues.queuereversal.reversalusingtempqueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueReversalWithTmpQueueDemo {
    public static void main(String args[]) {
        Queue<Integer> queue =  new LinkedList<>();
        queue.add(10);
        queue.add(30);
        queue.add(60);
        //stack.push(4);
        //stack.push(5);

        QueueReversalWithTempQueue reverseAStack = new QueueReversalWithTempQueue();
        reverseAStack.reverseQueueRecursively(queue);

        System.out.println(Arrays.toString(queue.toArray()));
    }
}

