package Pattern;

import java.util.*;

public class LeftHalfPyramid {
    public static void leftHalfPyramid(int n) {
        // outerLoop
        for (int i = 1; i <= n; i++) {
            // Inner loopsgit 
            // Sapce printing loop
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Stars print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        leftHalfPyramid(10);
    }
}