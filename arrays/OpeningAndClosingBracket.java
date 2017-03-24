package arrays;

import java.util.Scanner;

/**
 * Created by chitrasharma on 20/03/17.
 */
public class OpeningAndClosingBracket {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        OpeningAndClosingBracket myObj = new OpeningAndClosingBracket();
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
        //int leftClose=0;
        //int rightOpen = 0;
        int rightClose =0;
        int index = 0;
        int length = array.length;
        for(int i=0; i<length; i++) {

            for(int j=i-1; j>=0; j--) {
                if(array[j] == '(') {
                    leftOpen++;
                }
                System.out.println("array["+j+"] ->" + array[j]);
                /*
                if(array[i] == ')') {
                    leftClose++;
                }
                */
            }

            for(int k=i; k<length; k++) {
                if(array[k] == ')') {
                    rightClose++;
                }
                System.out.println("array["+k+"] ->" + array[k]);
                /*
                if(array[i] == '(') {
                    rightOpen++;
                }
                */
            }

            if(leftOpen != 0 && rightClose !=0 && (leftOpen == rightClose)) {
                index = i;
                break;
            }
            leftOpen =0;
            rightClose = 0;
            System.out.println("------------------------------------");
        }
    return index;
    }

}
