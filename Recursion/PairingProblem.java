package Recursion;

import java.util.*;

public class PairingProblem {
    public static int pairingWay(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return pairingWay(n - 1) + (n - 1) * pairingWay(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(pairingWay(3));

    }
}