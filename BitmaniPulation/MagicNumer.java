package BitmaniPulation;

import java.util.*;

public class MagicNumer {
    public static int findMagicNumber(int n) {
        int magic = 0;
        int pw = 5;
        while (n > 0) {
            if ((n & 1) == 1) {
                magic += 1 * pw;
            }
            pw *= 5;
            n = n >> 1;
        }
        return magic;
    }

    public static void main(String args[]) {
        int n = 6;
        System.out.println(findMagicNumber(n));
    }
}