package stacksandqueues.sortingastack;

import java.util.Stack;

public class SortingStackInAscedingOrder {

    public Stack<Integer> getSortedStack(Stack<Integer> input) {
        Stack<Integer> sortedStack = new Stack<Integer>();

        while(!input.empty()) {
            int temp = input.pop();
            while(!sortedStack.isEmpty() && sortedStack.peek() > temp) {
                input.push(sortedStack.pop());
            }
            sortedStack.push(temp);
        }
        return sortedStack;
    }
}
