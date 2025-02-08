package BasicSort;

import java.util.*;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int minEle = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = minEle;
        }
    }

    public static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int num[] = { 5, 4, 1, 3, 2 };
        selectionSort(num);
        printArr(num);

    }
}