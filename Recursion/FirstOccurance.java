package Recursion;

public class FirstOccurance {
    public static int firstOcc(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int num[] = { 8, 3, 9, 6, 5, 10, 2, 5, 3 };
        System.out.println(firstOcc(num, 5, 0));
        ;
    }
}