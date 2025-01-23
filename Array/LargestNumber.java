package Array;

import java.util.*;

public class LargestNumber {
    public static int getLargestNumber(int num[]) {
        int largestNum = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity value;
        for (int i = 0; i < num.length; i++) {
            if (largestNum < num[i]) {
                largestNum = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("The smallest number is : " + smallest);
        return largestNum;
    }

    public static void main(String args[]) {
        int number[] = { 1, 3, 4, 5, 79, 99 };
        int lgNum = getLargestNumber(number);
        System.out.println("The largest number in the Array is: " + lgNum);
    }
}