package Matrc;

public class StairSearch {
    public static boolean starisSearch(int matrix[][], int key) {
        int n = matrix.length - 1;
        int m = matrix[0].length - 1;
        int row = 0;
        int col = m;
        while (row <= n && col >= 0) {
            if (key == matrix[row][col]) {
                System.out.println("Value at cell number : " + row + " " + col);
                return true;

            } else if (key > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        System.out.println("The value is not exist");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        starisSearch(matrix, 100);

    }
}