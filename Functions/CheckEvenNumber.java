package Functions;

import java.util.*;

public class CheckEvenNumber {
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scr.nextInt();
        if (isEven(num)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}