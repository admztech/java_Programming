package Recursion;

import java.util.*;

public class LinearSearch {
    public static boolean linearSea(int arr[], int target, int i) {
        if (i > arr.length - 1) {
            return false;
        }
        return (target == arr[i]) || linearSea(arr, target, i + 1);
    }

    public static void main(String[] args) {
        int num[] = { 3, 2, 1, 18, 9 };
        System.out.println(linearSea(num, -1, 0));

    }
}