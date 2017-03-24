import java.util.HashSet;
import java.util.Scanner;

public class MaximumOccurredIntegerInRange {

    public static void main(String args[]) {
        //Scanner sc = new Scanner(System.in);
        //int noOfLines = 4;
        int left[] = new int[]{1, 4, 3, 1};
        int right[] = new int[]{15, 8, 5, 4};
        if (left.length != right.length) {
            return;
        }
        int maxSize = 0;
        for (int i = 0; i < right.length; i++) {
            if (right[i] > maxSize) {
                maxSize = right[i];
            }
        }
        int[] repeatedNumArr = new int[maxSize+1];
        for (int i = 0; i < right.length; i++) {
            int leftValue = left[i], rightValue = right[i];
            while (leftValue <= rightValue) {
                int repeatedCount = repeatedNumArr[leftValue];
                repeatedNumArr[leftValue] = ++repeatedCount;
                leftValue++;
            }
        }
        int maxRepeatedCount = 0;
        for (int i=0; i<repeatedNumArr.length; i++) {
            if(repeatedNumArr[i] > maxRepeatedCount) {
                maxRepeatedCount = repeatedNumArr[i];
            }
        }
        for (int i=0; i<repeatedNumArr.length; i++) {
            if(repeatedNumArr[i] == maxRepeatedCount) {
                System.out.print(i + " ");
            }
        }
    }
}
