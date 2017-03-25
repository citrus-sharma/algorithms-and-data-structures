package linkedlists;


public class NodeV1 {
    public int data;
    public NodeV1 next = null;

    public static void main(String args[]) {
        NodeV1 n = new NodeV1(5);
        n.add(4).add(7).add(2).add(6);

        System.out.println(n);
    }

    public NodeV1(int data) {
        this.data = data;
    }

    public NodeV1 add(int data) {
        NodeV1 n = new NodeV1(data);
        this.next = n;
        return n;
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