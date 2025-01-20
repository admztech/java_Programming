package Functions;

import java.util.*;

import javax.script.ScriptEngineManager;

public class someOfDigits {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter an Integer value");
        int digits = scr.nextInt();
        System.out.println("The sume of its digits is + " + sumOfDigits(digits));

    }
}