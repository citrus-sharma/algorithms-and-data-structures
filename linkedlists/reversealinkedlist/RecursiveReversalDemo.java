package linkedlists.reversealinkedlist;

import linkedlists.LinkedList;

public class RecursiveReversalDemo {
    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("before swapping");
        System.out.println(linkedList);

        linkedList.recursiveReversal();
        System.out.println("after swapping");
        System.out.println(linkedList);
    }
}
