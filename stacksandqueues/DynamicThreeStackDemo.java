package stacksandqueues;

import java.util.Scanner;

public class DynamicThreeStackDemo {

    public static void main(String args[]) {
        DynamicThreeStack threeStack = new DynamicThreeStack();
        threeStack.populateFreeList();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                String[] input = scanner.nextLine().split(" ");
                String action = input[0];
                int arrNum = Integer.parseInt(input[1]);
                int item = 0;
                if (action.equals("p")) {
                    item = Integer.parseInt(input[2]);
                }
                switch (action) {
                    case "p":
                        threeStack.push(arrNum, item);
                        break;
                    case "o":
                        threeStack.pop(arrNum);
                        break;
                }

                for (int i = 0; i < threeStack.getBuffer().length; i++) {
                    System.out.print(threeStack.getBuffer()[i]);
                }
                System.out.println();
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
