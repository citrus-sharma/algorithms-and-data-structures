package stacksandqueues;

import linkedlists.NodeV1;

public class Stack {
    NodeV1 top = null;
    public Stack minStack = null;

    public NodeV1 getTop() {
        return top;
    }

    public NodeV1 pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("underflow");
        }
        NodeV1 result = top;
        deleteFromMinStack(result);

        top = top.getNext();
        return result;
    }

    private void deleteFromMinStack(NodeV1 node) throws Exception{
        if(minStack.top.getData() == node.getData()) {
            minStack.top = minStack.top.getNext();
        }
    }

    private void pushToMinStack(NodeV1 node) {
        NodeV1 n = new NodeV1(node.getData());
        if(minStack.top == null) {
            minStack.top = n;
        }else if(node.getData() <= minStack.top.getData()){
            n.setNext(minStack.top);
            minStack.top = n;
        }
    }

    public void push(int item) {
        NodeV1 n = new NodeV1(item);
        if(top == null) {
            top = n;
        }else {
            n.setNext(top);
            top = n;
        }
        pushToMinStack(n);
    }

    public int getMin() {
        if(minStack == null) {
           throw new Error("no min element found");
        }
        return minStack.top.getData();
    }

    public boolean isEmpty() {
        return (top == null);
    }
}
