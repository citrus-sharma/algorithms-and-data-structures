package stacksandqueues.arraystack;

import java.util.Scanner;

public class StackWithArrayDemo {
    public static void main(String args[]) {
        StackWithArray stack = new StackWithArray();
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                String[] input = sc.nextLine().split(" ");
                String action = input[0];
                //int arrNum = Integer.parseInt(input[1]);
                int item = 0;
                if (action.equals("p")) {
                    item = Integer.parseInt(input[1]);
                }
                switch (action) {
                    case "p":
                        System.out.println(stack.push(item));
                        break;
                    case "o":
                        System.out.println(stack.pop());
                        break;
                }
                //System.out.println();
                //stack.displayStack();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
