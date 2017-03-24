package arrays;

import java.util.Scanner;

public class OpeningAndClosingBracketV1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        OpeningAndClosingBracketV1 myObj = new OpeningAndClosingBracketV1();
        int result = myObj.getSectionCount(input);
        System.out.println("=================================");
        System.out.println("result is : " +result);
    }

    private int getSectionCount(String input) {
        if(!input.contains(")")) {
            return 0;
        } else if(!input.contains("(")) {
            return 0;
        }

        char array[] = input.toCharArray();

        int leftOpen = 0;
        int leftClose = 0;
        int rightOpen = 0;
        int rightClose = 0;

        int index = 0;
        int length = array.length;
        for(int i=0; i<length; i++) {
            if(array[i] == '(') {
                rightOpen++;
            }
            if(array[i] == ')') {
                rightClose++;
            }
        }

        for(int j=0; j< length; j++) {
            if(array[j] == '(') {
                leftOpen++;
                rightClose--;
            }
            if(array[j] == ')') {
                leftClose++;
                rightOpen--;
            }
            if(leftOpen!= 0 && rightClose != 0 && leftOpen == rightClose)
            {
                index = j;
               // break;
            }
        }
        return index;
    }
}
