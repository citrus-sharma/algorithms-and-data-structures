package stacksandqueues.arraystack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by chitrasharma on 25/03/17.
 */
public class ArrayStackDemo {

    public static void main(String args[]) {
        int [] arr = new int[10];
        List<ArrayStack> arrayStack = new ArrayList<>();
        arrayStack.add(new ArrayStack(arr,0, (arr.length/3) -1 ,0));
        arrayStack.add(new ArrayStack(arr,arr.length/3, (arr.length/3)*2 -1,0));
        arrayStack.add(new ArrayStack(arr,(arr.length/3)*2, arr.length-1,0));

        //System.out.print(arrayStack.get(0).end);
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
                        arrayStack.get(arrNum).push(item);
                        break;
                    case "o":
                        arrayStack.get(arrNum).pop();
                        break;
                }

                for(int j=0; j < arrayStack.size(); j++) {
                    System.out.print(arrayStack.get(j).start);
                    System.out.print(" " + arrayStack.get(j).end);
                    System.out.print(" " + arrayStack.get(j).size);
                    System.out.println();
                }
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }



}
