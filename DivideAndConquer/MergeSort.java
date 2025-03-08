package DivideAndConquer;

import java.util.*;

public class MergeSort {
    public static void divide(int arr[]) {
        int n = arr.length;
        int si = 0;
        int ei = n - 1;
        int mid = si + (ei - si) / 2;
        int lefarr[];
        int rightarr[];
        for (int i = 0; i <= mid; i++) {
            lefarr[i] = arr[i]
        }
        System.out.println();
        for (int j = mid + 1; j < n; j++) {
            System.err.print(arr[j] + " ");
        }

    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3 };
        divide(num);
    }
}