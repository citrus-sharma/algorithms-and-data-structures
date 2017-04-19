package stacksandqueues.stackreversal.stackreversalwithtempstack;

import java.util.Arrays;
import java.util.Stack;

public class StackReversalWithTempStackDemo {
    public static void main(String args[]) {
        Stack<Integer> stack =  new Stack<>();
        stack.push(1);
        stack.push(20);
        stack.push(50);
        //stack.push(4);
        //stack.push(5);

        StackReversalWithTempStack stackReversal = new StackReversalWithTempStack();
        stackReversal.reverseStackRecursively(stack);

        System.out.println(Arrays.toString(stack.toArray()));
    }
}

