package stacksandqueues.arraystack;

public class StackWithArray {
    private int [] arr = new int[3];
    private int top = -1;

    public boolean isEmpty() {
        return (top<0);
    }
    public boolean push(int item) {
        if(top >= arr.length-1) {
            throw new RuntimeException("overflow");
        } else {
            top++;
            arr[top] = item;
            return true;
        }
    }

    public int pop() {
        if(top < 0) {
            throw new RuntimeException("underflow");
        }
        else {
            int result = arr[top];
            arr[top] = 0;
            top--;
            return result;
        }
    }

    public void displayStack() {
        for(int i=top-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
