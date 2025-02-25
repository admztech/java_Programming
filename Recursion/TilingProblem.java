package Recursion;

import java.util.*;

public class TilingProblem {
    public static int tilinProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tilinProblem(n - 1);
        int fnm2 = tilinProblem(n - 2);
        int totalway = fnm1 + fnm2;
        return totalway;
    }

    public static void main(String[] args) {
        System.out.println(tilinProblem(4));
    }
}