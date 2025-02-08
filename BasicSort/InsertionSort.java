package BasicSort;

import java.util.*;

public class InsertionSort {

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 5, 4, 3, 2, 1 };
        System.out.println("Before sorting");
        printArr(num);
        insertionSort(num);
        System.out.println("AFter sorting ");
        printArr(num);
    }
}