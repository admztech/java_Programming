package Matrc;

public class BinearySearch {
    public static boolean searchMatrix(int matrix[][], int target) {

        int n = matrix.length;
        int m = matrix[0].length;
        int sr = 0;
        int er = n - 1;
        while (sr <= er) {
            int mid = (sr + er) / 2;

            if (target >= matrix[mid][0] && target <= matrix[mid][m - 1]) {
                // search binary in that row
                boolean found = binSearch(matrix[mid], target);
                return found;
            } else if (target >= matrix[mid][m - 1]) {
                sr = mid + 1;
            } else {
                er = mid - 1;
            }
        }
        return false;
    }

    public static boolean binSearch(int matrix[], int target) {
        int col = matrix.length;
        int st = 0, et = col - 1;
        while (st <= et) {
            int mid = (st + et) / 2;
            if (target == matrix[mid]) {
                return true;
            } else if (target >= matrix[mid]) {
                st = mid + 1;
            } else {
                et = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // 1.matrix is sort . 2 Frist value of each row is greater than the last value
        // of previus row.
        int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int t = 65;
        boolean val = searchMatrix(matrix, t);
        System.out.println(val);

    }
}
