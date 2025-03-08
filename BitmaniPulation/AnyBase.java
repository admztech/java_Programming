package BitmaniPulation;

import java.util.*;

public class AnyBase {
    public static int anBasetoDecimal(int n, int b1) {
        int res = 0;
        int pw = 1;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            res += digit * pw;
            pw *= b1;

        }
        return res;
    }

    public static int toFinalBase(int n, int b1, int b2) {
        int res = 0;
        int pw = 1;
        int dec = anBasetoDecimal(n, b1);
        while (dec > 0) {
            int digit = dec % b2;
            dec /= b2;

            res += digit * pw;
            pw *= 10;

        }
        return res;
    }

    public static void main(String args[]) {

    }
}