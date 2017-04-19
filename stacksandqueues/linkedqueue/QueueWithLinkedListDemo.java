package stacksandqueues.linkedqueue;

public class QueueWithLinkedListDemo {
    public static  void main(String args[]) {
        LinkedQueue linkedQueue = new LinkedQueue();
        //linkedQueue.enqueue(100);
        //linkedQueue.enqueue(200);
        //linkedQueue.enqueue(300);
        linkedQueue.enqueue(200);

        System.out.println(linkedQueue.isEmpty());
        System.out.println(linkedQueue.dequeue());
        System.out.println(linkedQueue.dequeue());
        //System.out.println(linkedQueue.dequeue());
    }

}
