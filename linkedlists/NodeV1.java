package linkedlists;


public class NodeV1 {
    private int data;
    private NodeV1 next = null;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeV1 getNext() {
        return next;
    }

    public void setNext(NodeV1 next) {
        this.next = next;
    }

    public NodeV1(int data) {
        this.data = data;
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