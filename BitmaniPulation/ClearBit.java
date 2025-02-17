package BitmaniPulation;

import java.util.*;

public class ClearBit {
    public static int clearBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(clearBit(n, 0));
    }
}