package Array;

import java.util.*;

public class ReverseArray {
    public static void reverse(int n[]) {
        int first = 0;
        int last = n.length - 1;
        while (first < last) {
            int temp = n[first];
            n[first] = n[last];
            n[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 5, 6, 7, 8 };
        reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}