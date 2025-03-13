package Recursion;

import java.util.*;

public class ChechArraySorted {
    public static boolean checkArr(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return (arr[i] < arr[i + 1] && checkArr(arr, i + 1));
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 4, 5 };
        System.out.println(checkArr(num, 0));

    }
}