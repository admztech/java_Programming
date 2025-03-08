package BitmaniPulation;

import java.util.*;

public class UniqueTwo {
    public static void towUnique(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        int x = 0;
        int y = 0;
        int rsbm = ans & -ans;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & rsbm) == 0) {
                x = x ^ arr[i];
            } else {
                y ^= arr[i];
            }
        }
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String args[]) {
        int[] num = { 1, 23, 56, 47, 1, 56, 23 };
        towUnique(num);

    }
}