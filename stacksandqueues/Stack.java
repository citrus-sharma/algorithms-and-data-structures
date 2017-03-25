package stacksandqueues;

import linkedlists.NodeV1;

public class Stack {
    NodeV1 top = null;
    Stack minStack = null;


    public NodeV1 pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("underflow");
        }
        NodeV1 result = top;
        deleteFromMinStack(result);

        top = top.next;
        return result;
    }

    private void deleteFromMinStack(NodeV1 node) throws Exception{
        if(minStack.top.data == node.data) {
            minStack.top = minStack.top.next;
        }
    }

    private void pushToMinStack(NodeV1 node) {
        NodeV1 n = new NodeV1(node.data);
        if(minStack.top == null) {
            minStack.top = n;
        }else if(node.data <= minStack.top.data){
            n.next = minStack.top;
            minStack.top = n;
        }
    }

    public void push(int item) {
        NodeV1 n = new NodeV1(item);
        if(top == null) {
            top = n;
        }else {
            n.next = top;
            top = n;
        }
        pushToMinStack(n);
    }

    public int getMin() {
        if(minStack == null) {
           throw new Error("no min element found");
        }
        return minStack.top.data;
    }

    public boolean isEmpty() {
        return (top == null);
    }
}
