package Functions;

import java.util.*;

public class useFunction {
    // Produt of Two number;
    public static int produtTWoNumber(int num1, int num2) {
        int product = (num1 * num2);
        return product;
    }

    // Calculate Factorial of a number
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int binomialCofficient(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fac = factorial(n - r);
        int bioCof = n_fact / (r_fact * nmr_fac);
        return bioCof;
    }

    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);
        binomialCofficient(45, 5);

    }
}
