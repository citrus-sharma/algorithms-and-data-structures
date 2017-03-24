package linkedlists;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String args[]) {
        Set<Integer> duplicates = new HashSet<Integer>();

        RemoveDuplicates duplicateInUnsortedLinkedList = new RemoveDuplicates();

        NodeV1<Integer> head = new NodeV1(5);
        head.add(4).add(1).add(7).add(2).add(6).add(5).add(1).add(1).add(1).add(7).add(9);
        System.out.println("with duplicates");
        System.out.println(head);

        duplicates.add(head.data);
        NodeV1 node  = duplicateInUnsortedLinkedList.deleteDuplicates(head, duplicates);
        System.out.println("without duplicates");
        System.out.println(node);
    }

    private NodeV1 deleteDuplicates(NodeV1 head, Set<Integer> duplicates) {

        NodeV1<Integer> node = head;

        while(node != null && node.next != null) {
            if(!duplicates.contains(node.next.data)) {
                duplicates.add((Integer) node.next.data);
                node = node.next;
            } else {
                deleteNode(node);
            }
        }
        return head;
    }

    private void deleteNode(NodeV1 n) {
        n.next = n.next.next;

    }
}
