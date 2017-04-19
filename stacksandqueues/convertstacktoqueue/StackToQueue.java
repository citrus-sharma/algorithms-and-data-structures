package stacksandqueues.convertstacktoqueue;

import linkedlists.NodeV1;

import java.util.LinkedList;
import java.util.Queue;

public class StackToQueue {
    private NodeV1 top = null;
    private Queue<Integer> tempQueue = new LinkedList<>();

    public NodeV1 getLastValueFromStack() throws Exception{
        NodeV1 temp = top;
        NodeV1 previous = null;
        while(temp.getNext() != null) {
            tempQueue.add(temp.getData());
            previous = temp;
            temp = temp.getNext();
        }
        previous.setNext(null);
        return temp;
    }

    public void copyQueueToStack() throws Exception{
        while(!tempQueue.isEmpty()) {
            push(tempQueue.remove());
        }
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("underflow");
        }
        NodeV1 result =  getLastValueFromStack();
        copyQueueToStack();
        return result.getData();
    }


    public void push(int item) {
        NodeV1 n = new NodeV1(item);
        if(top == null) {
            top = n;
        }else {
            n.setNext(top);
            top = n;
        }
    }

    public boolean isEmpty() {
        return (top == null);
    }
}
