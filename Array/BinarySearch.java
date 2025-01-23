package Array;

import java.util.*;

public class BinarySearch {
    public static int binarySearch(int num[], int key) {
        int start = 0, end = num.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 4, 8, 10, 12, 14, 16, 18 };
        int key = 0;
        int index = binarySearch(number, key);
        if (index >= 0) {
            System.out.println("The index of " + key + " is : " + index);
        } else {
            System.out.println(key + " is not Exist in Array");
        }

    }

}