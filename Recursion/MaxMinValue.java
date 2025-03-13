package Recursion;

import java.util.*;

public class MaxMinValue {
    public static int findMinRec(int arr[], int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMinRec(arr, n - 1));
    }

    public static int findMaxRec(int arr[], int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], findMaxRec(arr, n - 1));
    }

    public static void main(String args[]) {
        int num[] = { 1, 4, 45, 6, -50, 10, 2 };
        int n = num.length;
        System.out.println("The Minimum value is " + findMinRec(num, n));
        System.out.println("The MaxValue value is " + findMaxRec(num, n));

    }
}