
public class Node<Item> {
    Item data;
    Node next = null;

    public static void main(String args[]) {
        Node n = new Node(5);
        n.addToEnd(3);
        n.addToEnd(4);
        n.addToEnd(2);
        System.out.println(n);
    }

    public Node(Item data) {
        this.data = data;
    }
    public void addToEnd(Item data) {
        Node end = new Node(data);
        Node current = this;
        while(current.next != null) {
            current = current.next;
        }
        current.next = end;

        /*
        Node n = new Node(data);
        this.next = n;
        return n;
        */
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("data-> ");
        b.append(this.data);
        b.append(", Next: ");
        if(this.next == null) {
            b.append("null");
        } else {
            b.append(this.next.toString());
        }
        return b.toString();
    }

}
