package Matrc;

import java.util.*;

public class matrix3 {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[1][i];
        }
        System.out.println("The sume of 2 row is " + sum);
    }
}