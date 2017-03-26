package stacksandqueues.stackofstacks;

import linkedlists.NodeV1;

public class Stack {
    private int size = 0;
    private int max_size = 5;
    private NodeV1 top = null;

    public boolean isFull() {
        return (size == max_size);
    }

    public void push(int item) {
        NodeV1 n = new NodeV1(item);
        if(top == null) {
            top = n;
        }else {
            n.next = top;
            top = n;
        }
        size ++;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("underflow");
        }
        NodeV1 result = top;
        top = top.next;
        size--;
        return result.data;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void diplayStack() {
        NodeV1 tempTop = top;
        while (tempTop != null) {
            System.out.print(tempTop.data + " ");
            tempTop = tempTop.next;
        }
    }
}
