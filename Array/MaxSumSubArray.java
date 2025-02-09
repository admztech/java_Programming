package Array;

import java.util.*;

public class MaxSumSubArray {
    public static void printMaxSumS(int num[]) {
        int maxSum = Integer.MIN_VALUE; // minus infinit;
        int sum = 0;

        int n = num.length;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += num[k];
                }
                maxSum = Math.max(sum, maxSum);

            }
            System.out.println();
        }
        System.out.println("Maximum Sum is: " + maxSum);

    }

    public static void main(String[] args) {

        int[] numbers = { 2, 4, 6, 8, 10 };
        printMaxSumS(numbers);
    }
}