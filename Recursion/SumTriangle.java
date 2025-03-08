package Recursion;

import java.util.*;

public class SumTriangle {

    public static void generateSumTrianlge(int arr[]) {
        if (arr.length < 1) {
            return;
        }
        int newArr[] = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i] + arr[i + 1];
        }
        generateSumTrianlge(newArr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]) {
        int numn[] = { 1, 2, 3, 4, 5, 6, 7 };
        generateSumTrianlge(numn);
    }
}