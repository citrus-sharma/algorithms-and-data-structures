package stacksandqueues.stackofstacks;

import java.util.ArrayList;
import java.util.List;

public class StackList {
    private int currentIndex = -1;
    private List<Stack> stackList = null;

    public StackList() {
        stackList = new ArrayList<Stack>();
    }

    public void push(int item) {
        if(currentIndex == -1 || stackList.get(currentIndex).isFull()) {
            Stack stack = new Stack();
            stack.push(item);
            stackList.add(stack);
            currentIndex++;
        }else {
            stackList.get(currentIndex).push(item);
        }
        System.out.println("push index ->"+ currentIndex);

    }

    public int pop(int stackNum) throws Exception{
        System.out.println("push index ->"+ stackNum);
        return stackList.get(stackNum).pop();
    }

    public int pop() throws Exception{
        if(stackList.get(currentIndex).isEmpty()) {
            currentIndex--;
        }
        if(currentIndex == -1) {
            throw new Exception("under flow");
        }
        return pop(currentIndex);
    }

}
