package Pattern;

import java.util.*;

public class PalindromicPattern {
    public static void printPalindromicPattern(int n) {
        // outerloop
        for (int i = 1; i <= n; i++) {
            // spaces n-i
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // first halff number rever order from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // 2nd half pyradmind print number from 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPalindromicPattern(5);

    }

}