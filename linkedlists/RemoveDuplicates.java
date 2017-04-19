package linkedlists;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String args[]) {
        Set<Integer> duplicates = new HashSet<Integer>();

        RemoveDuplicates duplicateInUnsortedLinkedList = new RemoveDuplicates();
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(4);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(10);
        /*
        NodeV1 head = new NodeV1(5);
        head.add(4).add(1).add(7).add(2).add(6).add(5).add(1).add(1).add(1).add(7).add(9);
        */
        System.out.println("with duplicates");
        System.out.println(linkedList);

        duplicates.add(linkedList.getHead().getData());
        NodeV1 node  = duplicateInUnsortedLinkedList.deleteDuplicates(linkedList.getHead(), duplicates);
        System.out.println("without duplicates");
        System.out.println(node);
    }

    private NodeV1 deleteDuplicates(NodeV1 head, Set<Integer> duplicates) {

        NodeV1 node = head;

        while(node != null && node.getNext() != null) {
            if(!duplicates.contains(node.getNext().getData())) {
                duplicates.add((node.getNext().getData()));
                node = node.getNext();
            } else {
                deleteNode(node);
            }
        }
        return head;
    }

    private void deleteNode(NodeV1 n) {
        n.setNext(n.getNext().getNext());

    }
}
