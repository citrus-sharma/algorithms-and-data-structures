package stacksandqueues.convertstacktoqueue;

public class StackToQueueDemo {
    public static void main(String args[]) throws Exception{
        StackToQueue stack = new StackToQueue();
        stack.push(4);
        stack.push(9);
        stack.push(10);
        stack.push(13);
        stack.push(20);
        System.out.println("initial stack");


        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
