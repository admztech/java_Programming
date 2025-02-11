package Matrc;

import java.util.*;

public class MjorRC {
    public static void printMajorRS(int matrix[][]) {
        int mrs = Integer.MIN_VALUE;

        int rs = 0;

        int n = matrix.length;
        int m = matrix[0].length;
        for (int r = 0; r < n; r++) {
            rs = 0;
            for (int c = 0; c < m; c++) {
                rs += matrix[r][c];
            }
            mrs = Math.max(mrs, rs);
        }
        System.out.println("Major Row sum is " + mrs);

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printMajorRC(matrix);

    }
}