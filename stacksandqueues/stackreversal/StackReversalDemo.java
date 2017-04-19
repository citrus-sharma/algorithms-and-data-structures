package stacksandqueues.stackreversal;

import stacksandqueues.Stack;

public class StackReversalDemo {
    public static void main(String args[]) throws Exception{
        Stack stack = new Stack();
        stack.minStack = new Stack();
        stack.push(4);
        stack.push(8);
        stack.push(12);
        stack.push(15);
        StackReversal stackReversal = new StackReversal();
        System.out.println("before reversal");
        System.out.println(stack.getTop());

        stackReversal.reverseStack(stack);

        System.out.println("after reversal");
        System.out.println(stack.getTop());
    }
    
}
