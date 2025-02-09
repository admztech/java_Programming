package Array;

import java.util.*;

public class SubArray {
    public static void printSubArray(int num[]) {
        int count = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            // Start of sub array
            int start = i;
            for (int j = i; j < num.length; j++) {
                // end of sub array
                int end = j;
                int sum = 0;
                // print the sub array from start to end for each iteration and after that each
                // time the end of chagne for each element
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                    sum += num[k];
                }
                count++;
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of Sub Array : " + count);
        // System.out.println("Maximum sum: " + maxSum);
        // System.out.println("Minmum sum of sub array : " + minSum);
    }

    public static void main(String[] args) {
        int[] number = { 2, 4, 6, 8, 10 };
        printSubArray(number);

    }

}