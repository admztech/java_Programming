package BitmaniPulation;

import java.util.*;

public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int KerAlgo(int n) {
        int count = 0;
        while (n > 0) {
            int rsbm = (n & -n);
            n = n - rsbm;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(63));
        System.out.println(KerAlgo(63));

    }

}