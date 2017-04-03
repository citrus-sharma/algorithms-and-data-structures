package stacksandqueues.sortingastack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SortingStackDemo {
    public static void main(String args[]) {
        SortingStackInAscedingOrder sortingDemo = new SortingStackInAscedingOrder();
        Stack<Integer> stack = new Stack<>();
        Scanner sc =  new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        for(int i=0; i<input.length; i++) {
            stack.push(Integer.parseInt(input[i]));
        }
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(input));

        Stack<Integer> sortedStack = sortingDemo.getSortedStack(stack);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(sortedStack.toArray()));

    }
}
