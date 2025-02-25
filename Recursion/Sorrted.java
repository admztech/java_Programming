package Recursion;

public class Sorrted {
    public static boolean isSort(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSort(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6 };

        System.out.println(isSort(num, 0));

    }
}