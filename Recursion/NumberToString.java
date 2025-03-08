package Recursion;

import java.util.*;

public class NumberToString {
    public static String numberToString(int n) {

        StringBuilder result = new StringBuilder("");
        if (n != 0) {
            String map[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
            int digit = n % 10;
            result.append(map[digit]);
            numberToString(n / 10);
        }

        return result.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(numberToString(194));

    }
}