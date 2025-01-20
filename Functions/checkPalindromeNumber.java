package Functions;

import java.util.*;

public class checkPalindromeNumber {

    public static void isPalindromeNumber(int n) {
        int rev = 0;
        int number = n;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
        System.out.println(number);
        if (number == rev) {
            System.out.println(number + " is a Palindrome Number");
        } else {
            System.out.println(number + " Not a Palindrome Number");
        }
    }

    public static void main(String args[]) {
        isPalindromeNumber(123);
    }
}