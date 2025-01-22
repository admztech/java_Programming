package Pattern;

import java.util.*;

public class Butterfly {
    public static void butterlfyPrint(int n) {
        // first half outter loop
        for (int i = 1; i <= n; i++) {
            // print the stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // print the spaces
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }
            // print the start
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