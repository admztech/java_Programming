package BitmaniPulation;

import java.util.*;

public class ClearLastBits {
    public static int clearBits(int n, int i) {
        int bitmask = 1 << i;
        return (n & bitmask);
    }

    public static void main(String[] args) {
        int n = 13;

        System.out.println(clearBits(13, 3));
        // for (int i = 0; i < 3; i++) {
        // int bitMask = ~(1 << i);
        // n = n & bitMask;
        // }

    }
}