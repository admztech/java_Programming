package Pattern;

import java.util.*;

public class NumberPyramid {
    public static void printNumberPyramid(int n) {
        // outloop
        for (int i = 1; i <= n; i++) {
            // Space n-i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // start i
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberPyramid(7);

    }

}