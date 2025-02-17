package BitmaniPulation;

import java.util.*;

public class UpdateBit {
    public static int updateBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearbit(n, i);
        // } else {
        // return setbit(n, i);
        // }
        n = clearbit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;

    }

    public static int setbit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);

    }

    public static int clearbit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static void main(String[] args) {
        System.out.println(updateBit(5, 1, 1));
        ;
    }

}