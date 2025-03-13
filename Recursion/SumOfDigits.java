package Recursion;

import java.util.*;

public class SumOfDigits {
    public static int findSumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10 + findSumOfDigits(n / 10));
    }

    public static void main(String[] args) {
        System.out.println(findSumOfDigits(12345));

    }
}