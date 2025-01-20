package Functions;

import java.util.*;

public class PrimeNumber {

    // Print the prime number to give range

    public static void primesRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Optimized way to check the prime number is
    // on for n> 2 cases
    public static boolean isPrime(int n) {
        // corner case
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // // on for n> 2 cases
    // public static boolean isPrime(int n) {
    // // corner case
    // if (n == 2) {
    // return true;
    // }
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % 2 == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    public static void main(String[] args) {
        primesRange(1000);
    }
}
