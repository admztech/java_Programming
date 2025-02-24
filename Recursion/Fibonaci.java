package Recursion;

import java.util.*;

public class Fibonaci {
    public static int fibNum(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int fibn1 = fibNum(n - 1);
        int fibn2 = fibNum(n - 2);
        int fn = fibn1 + fibn2;
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fibNum(8));

    }

}