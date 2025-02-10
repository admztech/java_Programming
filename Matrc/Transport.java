package Matrc;

import java.util.*;

public class Transport {

    public static void printTransport(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int trans[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        printMatrix(matrix);
        System.out.println(" Transport of the matrix is ");
        printMatrix(trans);

    }

    public static void printMatrix(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 0 } };
        printTransport(matrix);

    }
}
