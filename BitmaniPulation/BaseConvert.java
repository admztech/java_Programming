package BitmaniPulation;

import java.util.*;

public class BaseConvert {
    public static int toAnyBase(int n, int b) {
        int rv = 0;
        int pow = 1;
        while (n > 0) {
            int digit = n % b;
            n /= b;
            rv += digit * pow;
            pow *= 10;
        }
        return rv;
    }

    public static void main(String args[]) {
        System.out.println(toAnyBase(100, 8));
    }
}