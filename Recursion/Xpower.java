package Recursion;

import java.util.*;

public class Xpower {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    public static int optimizedPower(int x, int n) {
        // basecase
        if (n == 0) {
            return 1;
        }
        int halfpower = optimizedPower(x, n / 2);
        int halfpowerSq = halfpower * halfpower;
        // n is odd
        if (n % 2 != 0) {
            halfpowerSq = x * halfpowerSq;
        }

        return halfpowerSq;
    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 30));

    }
}