package stacksandqueues.stackofstacks;

import java.util.Scanner;

public class StackListDemo {
    public static  void main(String args[]) {
        StackList stackList = new StackList();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                String[] input = scanner.nextLine().split(" ");
                String action = input[0];
                //int arrNum = Integer.parseInt(input[1]);
                int item = 0;
                if (action.equals("p")) {
                    item = Integer.parseInt(input[1]);
                }
                switch (action) {
                    case "p":
                        stackList.push(item);
                        break;
                    case "o":
                        System.out.println(stackList.pop());
                        break;
                }

                System.out.println();
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
