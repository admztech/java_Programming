package Recursion;

public class allOccurrences {
    public static void allOccurrence(int[] arr, int index, int key) {
        if (index == arr.length) {
            return;
        }
        if (key == arr[index]) {
            System.out.print(index + " ");
        }
        allOccurrence(arr, index + 1, key);
    }

    public static int firstOccur(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int num[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        System.out.println("Check all index of a arr");
        allOccurrence(num, 0, 2);

    }
}