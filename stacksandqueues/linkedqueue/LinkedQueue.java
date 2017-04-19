package stacksandqueues.linkedqueue;

import linkedlists.NodeV1;

import java.util.NoSuchElementException;

public class LinkedQueue {
    private NodeV1 tail;
    private NodeV1 head;


    public void enqueue(int value) {
        NodeV1 end = new NodeV1(value);
        if(head == null) {
            head = tail = end;
        } else {
            tail.setNext(end);
            tail = tail.getNext();
        }
    }

    public int dequeue() {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        NodeV1 result = head;
        head = head.getNext();

        if(head == null) {
            tail = null;
        }

        return result.getData();
    }

    public boolean isEmpty() {

        return (head == null && tail == null);
    }
}
