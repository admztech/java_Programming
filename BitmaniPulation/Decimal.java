package BitmaniPulation;

import java.util.*;

public class Decimal {
    public static int toDecimal(int n, int b) {
        int res = 0;
        int pw = 1;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            res += digit * pw;
            pw *= b;

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(toDecimal(101, 2));

    }
}