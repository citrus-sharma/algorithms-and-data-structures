package stacksandqueues.queueusingtwostacks;

import java.util.Scanner;

public class MyQueueDemo {
    public static void main(String args[]) {
        MyQueue myQueue = new MyQueue();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String[] input = scanner.nextLine().split(" ");
            String action = input[0];

            int item = 0;
            if (action.equals("e")) {
                item = Integer.parseInt(input[1]);
            }
            switch (action) {
                case "e":
                    myQueue.enqueue(item);
                    break;
                case "d":
                    System.out.println(myQueue.dequeue());
                    break;
            }
        }
    }

}
