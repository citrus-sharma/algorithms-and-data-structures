package stacksandqueues;

public class StackNode {
    private int previous;
    private int value;
    private int stackNum;
    public StackNode(int previous, int value, int stackNum) {
        this.previous = previous;
        this.value = value;
        this.stackNum = stackNum;
    }

    public int getPrevious() {
        return previous;
    }

    public void setPrevious(int previous) {
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();

        b.append("Stack No.-> ");
        b.append(this.stackNum);
        b.append("data-> ");
        b.append(this.value);
        b.append(", Previous: ");
        b.append(this.previous+"  #####  ");
        return b.toString();
    }
}
