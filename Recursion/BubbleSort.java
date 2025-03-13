package Recursion;

import java.util.*;

public class BubbleSort {
    public static void BubbleSort(int arr[], int n) {
        if (n == 1) {
            return;
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count += 1;

            }
            if (count == 0) {
                return;
            }
            BubbleSort(arr, n - 1);
        }

    }

    public static void main(String[] args) {

        int num[] = { 64, 34, 25, 12, 22, 11, 90 };
        BubbleSort(num, num.length);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}