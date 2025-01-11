import java.util.*;

public class ConditionalStatment {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int year = scr.nextInt();
        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a Leap year");
        }
        /*
         * // Q3 Print the week day
         * System.out.println("Enter the day number");
         * int day = scr.nextInt();
         * switch (day) {
         * case 1:
         * System.out.println("Monday");
         * break;
         * case 2:
         * System.out.println("Tuesday");
         * break;
         * case 3:
         * System.out.println("Wednesday");
         * break;
         * case 4:
         * System.out.println("Thursday");
         * break;
         * case 5:
         * System.out.println("Friday");
         * break;
         * case 6:
         * System.out.println("Saturday");
         * break;
         * case 7:
         * System.out.println("Sunday");
         * break;
         * default:
         * System.out.println("Invalid Inpute");
         * break;
         * }
         */
        /*
         * //Q2 check the Fever
         * double temp = 103.5;
         * if (temp > 100.00) {
         * System.out.println("You have a fever");
         * } else {
         * System.out.println("You have not fever");
         * }
         */
        /*
         * // Q1 Check Either number is Positve or Negative
         * System.out.println("Enter the number");
         * int number = scr.nextInt();
         * if (number > 0) {
         * System.out.println("Positive Number");
         * } else if (number == 0) {
         * System.out.println("Neither a negative nor postive number");
         * } else {
         * System.out.println("Postive number");
         * }
         */
        /*
         * // Calculator perfomr (+,/,*,- and % )
         * System.out.println("Enter the First number");
         * int a = scr.nextInt();
         * System.out.println("Enter the Second number");
         * int b = scr.nextInt();
         * System.out.println("Enter the Operator");
         * char operator = scr.next().charAt(0);
         * switch (operator) {
         * case '+':
         * System.out.println("Addition is: " + (a + b));
         * break;
         * case '-':
         * System.out.println("Subtraction is : " + (a - b));
         * break;
         * case '/':
         * System.out.println("division is :" + (a / b));
         * break;
         * case '*':
         * System.out.println("multiplication is :" + (a * b));
         * break;
         * case '%':
         * System.out.println("Remainder is : " + (a % b));
         * default:
         * System.out.println("The invalid input");
         * break;
         * }
         */
        /*
         * // check the Even and Odd
         * int number = 4;
         * String type = (number % 2 == 0) ? "Even" : "Odd";
         * System.out.println(type);
         * // Print the larges number from 3 number.
         * int A = 10, B = 20, C = 5;
         * if (A < B && A < C) {
         * System.out.println("The Largest number is  A");
         * } else if (B < C) {
         * System.out.println("The largest number is B");
         * } else {
         * System.out.println("The larges number is C");
         * }
         */
        /*
         * // System.out.println("Enter your income");
         * int income = scr.nextInt();
         * int tax;
         * if (income < 500000) {
         * tax = 0;
         * } else if (income <= 1000000) {
         * tax = (int) (income * 0.2);
         * } else {
         * tax = (int) (income * 0.3);
         * }
         */
        // System.out.println("You text is : " + tax);
        /*
         * int age = 19;
         * if (age >= 18) {
         * System.out.println("Adult");
         * } else if (age >= 13) {
         * System.out.println("Teenage");
         * } else {
         * System.out.println("child");
         * }
         */
        /*
         * // To check the number id Even or Odd.
         * 
         * System.out.println("Ente the number: ");
         * int number = scr.nextInt();
         * if (number % 2 == 0) {
         * System.out.println("Even Number");
         * } else {
         * System.out.println("Odd number");
         * }
         * 
         */
        // chech the agult or not
        /*
         * int age = 18;
         * if (age > 18) {
         * System.out.println("Adult: Drive, vote");
         * } else {
         * System.out.println("Not Adult");
         * }
         * System.out.println("Print the Largest of two number");
         * int a = 1;
         * int b = 5;
         * if (a > b) {
         * System.out.println("A is largest of two numer");
         * } else {
         * System.out.println("B is largest of two number ");
         * }
         */
    }
}