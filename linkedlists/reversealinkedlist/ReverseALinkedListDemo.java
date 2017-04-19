package linkedlists.reversealinkedlist;

import linkedlists.LinkedList;
import linkedlists.NodeV1;

public class ReverseALinkedListDemo {
    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        System.out.println("before swapping");
        System.out.println(linkedList);

        NodeV1 reversedLL = linkedList.reverseLinkedList();
        System.out.println("after swapping");
        System.out.println(reversedLL);

    }
}
