package BitmaniPulation;

import java.util.*;

public class PowerOFTwo {
    public static boolean isPowerOFTwo(int n) {
        return ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOFTwo(44));
    }
}