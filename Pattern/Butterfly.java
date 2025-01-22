package Pattern;

import java.util.*;

public class Butterfly {
    public static void butterlfyPrint(int n) {
        // first half outter loop
        for (int i = 1; i <= n; i++) {
            // print the stars -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // print the spaces - 2*(n-i)
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }
            // print the start -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half part
        for (int i = n; i >= 1; i--) {
            // start print -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space print-2(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // start -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        butterlfyPrint(5);
    }

}