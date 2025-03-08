package BitmaniPulation;

import java.util.*;

public class JosepAlog {
    public static int remindEle(int n) {
        int hp2 = powerof2(n);
        int l = n - hp2;
        return (2 * l) + 1;
    }

    public static int powerof2(int n) {
        int i = 1;
        while (i * 2 <= n) {
            i *= 2;
        }
        return i;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(remindEle(n));
    }
}