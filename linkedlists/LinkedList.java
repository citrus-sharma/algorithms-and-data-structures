package linkedlists;

public class LinkedList {
    NodeV1 head;

    public NodeV1 getHead() {
        return head;
    }

    public void add(int data) {
        NodeV1 end = new NodeV1(data);
        if(head == null) {
            head = end;
        }else {
            NodeV1 node = head;
            while(node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(end);
        }
    }

    public NodeV1 reverseLinkedList() {
        NodeV1 current = this.head;
        NodeV1 previous = null;
        while(current != null) {
            NodeV1 next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        this.head = previous;
        return head;
    }

    public NodeV1 recursiveReversal() {
        NodeV1 temp = this.head;
        return recursiveReversal1(temp, null);
    }

    public NodeV1 recursiveReversal(NodeV1 current, NodeV1 previous) {
        System.out.println("previous node  -> "+ previous);
        System.out.println("current node  -> "+ current);
        System.out.println();
        if(current.getNext() == null) {
            this.head = current;
            current.setNext(previous);
            return current;
        }
        NodeV1 next = current.getNext();
        current.setNext(previous);
        NodeV1 n = recursiveReversal(next, current);

        return  n;
    }

    public NodeV1 recursiveReversal1(NodeV1 current, NodeV1 previous) {
        System.out.println("previous node  -> "+ previous);
        System.out.println("current node  -> "+ current);
        System.out.println();
        if(current.getNext() == null) {
            current.setNext(previous);
            return current;
        } else {
            //previous = current;
            NodeV1 n = recursiveReversal1(current.getNext(), current);
            current.setNext(previous);
            return n;
        }
    }

    public void swapTwoNodes(int value) {
        NodeV1 current = this.head;
        NodeV1 previous = null;
        while(current != null) {
            //added condition current.getNext() != null to avoid swapping last element in the list
            if(current.getData() == value && current.getNext() != null)
            {
                NodeV1 next = current.getNext();
                //added condition to swap the first element. in this case head needs to be reset to point to the first element
                if(previous != null) {
                    previous.setNext(current.getNext());
                    current.setNext(current.getNext().getNext());
                    next.setNext(current);
                } else {
                    current.setNext(current.getNext().getNext());
                    next.setNext(current);
                    previous = next;
                    this.head = previous;
                }
            }
            else {
                previous = current;
            }
            current = current.getNext();
        }
    }

    public boolean searchForNode(int value) {
        NodeV1 node = head;
        while(node != null) {
            if(node.getData() == value) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        return this.head.toString();
    }
}
