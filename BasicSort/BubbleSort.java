package BasicSort;

import java.util.*;

public class BubbleSort {

    public static void bubleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;

            }

        }

    }

    public static void printArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int num[] = { 41, 9, 9, 48, 11, 2, 11, 12, 28, 10, 15, 4, 16, 48};
        bubleSort(num);
        printArr(num);
    }
}