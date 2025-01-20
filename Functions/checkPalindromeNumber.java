package Functions;

import java.util.*;

public class checkPalindromeNumber {

    public static boolean isPalindromeNumber(int n) {
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
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number");
        int palindrome = scr.nextInt();
        if (isPalindromeNumber(palindrome)) {

            System.out.println("Number is a Palindrome number");

        } else {
            {
                System.out.println("Number is not a Palindrome number");
            }
        }
    }
}