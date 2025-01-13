import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // Q1: Correct way to doing using the dowhile loop
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.println("Enter the number");
            number = scr.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("Do you want to continue? press 1 for Yes or 0 for No");
            choice = scr.nextInt();
        } while (choice == 1);
        System.out.println("Sum of the even Number: " + evenSum);
        System.out.println("Sum of the Odd numbers: " + oddSum);

        /*
         * // Q4: check the error
         * 
         * for (int i = 0; i <= 5; i++) {
         * System.out.println("i = " + i);
         * }
         * System.out.println("i after the loop = " + i);
         */
        /*
         * // Q3: Print the table of a given number
         * System.out.print("Enter the the to print the table: ");
         * int n = scr.nextInt();
         * for (int i = 1; i <= 10; i++) {
         * System.out.println(n + " * " + i + " = " + n * i);
         * }
         */

        /*
         * // Q2: Fint the Factorial of a number
         * int ftl = 1;
         * System.out.print("Enter the number to find Factorial: ");
         * int n = scr.nextInt();
         * for (int i = n; i > 0; i--) {
         * ftl *= i;
         * }
         * System.out.println("The factorial of " + n + " is " + ftl);
         * 
         */

        /*
         * // Q1: Read the Set of integers, and then prints the sum of the Even and odd
         * // integers
         * System.out.print("How many number you want enter: ");
         * int setOfInput = scr.nextInt();
         * int evenSum = 0;
         * int oddSum = 0;
         * for (int i = 1; i <= setOfInput; i++) {
         * System.out.print("Enter the number :");
         * int n = scr.nextInt();
         * if (n % 2 == 0) {
         * evenSum += n;
         * } else {
         * oddSum += n;
         * }
         * }
         * System.out.println("Even Number Sum is: " + evenSum);
         * System.out.println("Odd numbers Sum is: " + oddSum);
         */

        /*
         * // check the number is Prime or not
         * System.out.println("Enter the Number");
         * int n = scr.nextInt();
         * boolean isPrime = true;
         * if (n == 2) {
         * System.out.println("Prime number");
         * } else {
         * for (int i = 2; i <= Math.sqrt(n); i++) {
         * if (n % i == 0) {
         * isPrime = false;
         * }
         * }
         * if (isPrime) {
         * System.out.println("Prime number");
         * } else {
         * System.out.println("Not prime");
         * }
         * }
         */
        /*
         * // if the number is multipel of 10 then skip
         * 
         * int n = scr.nextInt();
         * do {
         * System.out.println("enter the number");
         * if (n % 10 == 0) {
         * continue;
         * }
         * System.out.println("You enter the number is: " + n);
         * } while (true);
         */

        /*
         * // Print number not multiple of 10
         * do {
         * System.out.println("Enter the number");
         * int n = scr.nextInt();
         * if (n != 0 && n % 10 == 0) {
         * break;
         * }
         * 
         * System.out.println("Out pur is :" + n);
         * } while (true);
         */
        /*
         * // Print the reverse of the number
         * int n = 2036;
         * int rev = 0;
         * while (n > 0) {
         * int lastDigit = n % 10;
         * rev = (rev * 10) + lastDigit;
         * n /= 10;
         * }
         * System.out.println(rev);
         */
    }

}