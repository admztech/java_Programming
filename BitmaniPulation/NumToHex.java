package BitmaniPulation;

import java.util.*;

public class NumToHex {
    public static String toHex(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder res = new StringBuilder("");
        while (n != 0) {
            int dig = n % 16;
            if (dig > 9) {
                char ch = (char) ('a' + (dig - 10));
                res.append(ch);
            } else {
                res.append(dig);
            }
            n = n / 16;
        }
        return res.reverse().toString();

    }

    public static void main(String[] args) {
        int num = -1;
        System.out.println(toHex(num));

    }
}