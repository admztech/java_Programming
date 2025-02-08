package BasicSort;

import java.util.*;

public class Assigment1 {
    public static void bubble(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (n - 1) - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selection(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[maxPos] < arr[j]) {
                    maxPos = j;
                }
            }
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void insertion(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }
    }

    public static void count(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int freq[] = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        int j = 0;
        for (int i = freq.length - 1; i >= 0; i--) {
            while (freq[i] > 0) {
                arr[j] = i;
                j++;
                freq[i]--;

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
        int num[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        System.out.println("Befor sort");
        printArr(num);
        System.out.println("after sort");
        count(num);
        printArr(num);
    }

}