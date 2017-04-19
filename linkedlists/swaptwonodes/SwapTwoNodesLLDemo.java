package linkedlists.swaptwonodes;

import linkedlists.LinkedList;

public class SwapTwoNodesLLDemo {
    public static void main(String args[]) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(10);

        System.out.println("before swapping");
        System.out.println(linkedList);

        System.out.println();
        System.out.println("after swapping");
        linkedList.swapTwoNodes(5);
        System.out.println(linkedList);
    }
}
