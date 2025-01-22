package Pattern;

import java.util.*;

public class SolidRhombus {
    public static void printSolidRhombus(int n) {
        // Out loop
        for (int i = 1; i <= n; i++) {
            // Space n-i times
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Stars n
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        printSolidRhombus(10);
    }
}