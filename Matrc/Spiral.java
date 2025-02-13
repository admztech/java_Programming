package Matrc;

import java.util.*;

public class Spiral {

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startcol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        while (startRow <= endRow && startcol <= endCol) {
            // top boundary
            for (int j = startcol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // right boundary
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom boundary
            for (int j = endCol - 1; j >= startcol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");

            }
            // left boundary
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startcol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");

            }
            startRow++;
            endRow--;
            startcol++;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 },
                { 13, 14, 15 } };
        printSpiral(matrix);

    }

}