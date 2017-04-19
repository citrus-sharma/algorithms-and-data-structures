package stacksandqueues.stackreversal.stackreversalwithtempstack;

import java.util.Stack;

public class StackReversalWithTempStack {
    private Stack<Integer> stack;

    public void reverseStackRecursively(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        reverseStackRecursively(stack, tempStack);
    }


    public void reverseStackRecursively(Stack<Integer> stack, Stack<Integer> tempStack) {
        reverseStackRecursivelyP(stack, tempStack);
        while(!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

    }

    public void reverseStackRecursivelyP(Stack<Integer> stack, Stack<Integer> tempStack) {
        if(!stack.isEmpty()) {
            int num = stack.pop();
            reverseStackRecursivelyP(stack, tempStack);
            tempStack.push(num);
        }
    }
}
