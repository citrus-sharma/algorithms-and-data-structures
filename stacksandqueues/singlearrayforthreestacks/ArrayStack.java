package stacksandqueues.singlearrayforthreestacks;

public class ArrayStack {
    int [] arr;
    int start, end, size;

    public ArrayStack(int[] arr, int start, int end, int size) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.size = size;
    }


    void push(int item) {
        if(size >= end - start + 1) {
            throw new RuntimeException("over flow");
        }
        arr[start+size] = item;
        size++;
    }

    int pop() {
        if(size == 0) {
            throw new RuntimeException("under flow");
        }
        int result = arr[start + size - 1];
        arr[start + size - 1] = 0;
        size--;
        return result;
    }
}
