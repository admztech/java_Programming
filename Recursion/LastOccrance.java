package Recursion;

import java.util.*;

public class LastOccrance {
    public static int lastOcc(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int num[] = { 88, 3, 6, 5, 10, 2, 5, 3 };
        System.out.println(lastOcc(num, 5, 0));

    }
}