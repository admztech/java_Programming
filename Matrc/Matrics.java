package Matrc;

import java.util.*;

public class Matrics {

    public static void smallerLarg(int matric[][]) {
        int smalest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int n = matric.length;
        int m = matric[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (largest < matric[i][j]) {
                    largest = matric[i][j];
                }
                if (smalest > matric[i][j]) {
                    smalest = matric[i][j];
                }
            }
        }
        System.out.println("That largest number " + largest);
        System.out.println("That largest number " + smalest);

    }

    public static boolean search(int matric[][], int key) {

        int n = matric.length;
        int m = matric[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matric[i][j] == key) {
                    System.out.println("Found  cell at " + "( " + i + ", " + j + " )");
                    return true;
                }

            }
            System.out.println();
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner scr = new Scanner(System.in);
        int n = 3, m = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scr.nextInt();
            }
        }
        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);
        smallerLarg(matrix);

    }
}