package Array;

import java.util.*;

public class LargestNumber {
    public static int getLargestNumber(int num[]) {
        int largestNum = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < num.length; i++) {
            if (largestNum < num[i]) {
                largestNum = num[i];
            }
        }
        return largestNum;
    }

    public static void main(String args[]) {
        int number[] = { 1, 3, 4, 5, 79, 99 };
        int lgNum = getLargestNumber(number);
        System.out.println("The largest number in the Array is: " + lgNum);
    }
}