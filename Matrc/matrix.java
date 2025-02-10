package Matrc;

import java.util.*;

public class matrix {
    public static void printRowwise(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printColWise(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int num[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.println("Print row wise");
        printRowwise(num);
        System.out.println("Print column wise");
        printColWise(num);

    }
}