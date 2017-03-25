package linkedlists;


public class NodeV2<Item> {
    Item data;
    NodeV2 next = null;

    public static void main(String args[]) {
        NodeV2 n = new NodeV2(5);
        n.addToEnd(3);
        n.addToEnd(4);
        n.addToEnd(2);
        System.out.println(n);
    }

    public NodeV2(Item data) {
        this.data = data;
    }
    public void addToEnd(Item data) {
        NodeV2 end = new NodeV2(data);
        NodeV2 current = this;
        while(current.next != null) {
            current = current.next;
        }
        current.next = end;
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
