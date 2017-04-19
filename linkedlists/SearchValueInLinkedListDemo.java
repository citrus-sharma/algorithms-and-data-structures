package linkedlists;

public class SearchValueInLinkedListDemo {
    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(10);
        linkedList.add(2);

        System.out.println(linkedList);
        boolean isValuePresent = linkedList.searchForNode(10);
        System.out.println(isValuePresent);
    }
}
