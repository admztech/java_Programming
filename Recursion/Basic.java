package Recursion;

import java.util.*;

public class Basic {
    public static void printDec(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        } else if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");

    }

    public static int sumofN(int n) {
        if (n == 1) {
            return 1;
        }
        int sn = 0;
        sn = n + sumofN(n - 1);
        return sn;
    }

    public static void main(String[] args) {
        printDec(3);
        printInc(3);
        System.out.println("Print the sum of N number is : " + sumofN(15));

    }
}