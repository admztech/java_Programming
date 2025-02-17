package BitmaniPulation;

import java.util.*;

public class setBit {
    public static int setbit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static void main(String[] args) {
        System.out.println(setbit(5, 0));
    }
}