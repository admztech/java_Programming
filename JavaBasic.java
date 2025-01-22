import java.util.*;

public class JavaBasic {
    public static void main(String args[]) {

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scr.nextInt();
        if (N <= 5) {
            System.out.println("MIT time");
        } else if (N <= 25) {
            System.out.println("MIT^2 time");
        } else if (N <= 125) {
            System.out.println("MIT^3 time");
        } else {
            int k = 2;
            while (Math.pow(5, k) <= N) {
                k++;
            }
            if (Math.pow(5, k - 1) < N && N <= Math.pow(5, k)) {
                System.out.println("MIT^" + k + " time");
            }
        }
    }
}

// int a = 10;
// double b = 10.0000000000001;
// System.out.println(a == b);

/*
 * that is conside the narrowing convertion from float to long
 * // int a = 10;
 * // float b = 25.25f;
 * // long c = 25;
 * // long d = a + b + c;
 * // System.out.println(d);
 */

// short a = 5;
// byte b = 25;
// char c = 'c';
// byte bt = a + b + c;
// System.err.println(bt);
/*
 * The are of the circle 2Pi(r*r)
 * float rad = scr.nextFloat();
 * float area = 2* 3.14f * rad * rad ;
 * System.out.println(area);
 */
/*
 * Product of two number
 * 
 * int a = scr.nextInt();
 * int b = scr.nextInt();
 * int product = a * b;
 * System.out.println(product);
 */

/*
 * summ of the two number
 * int a = scr.nextInt();
 * int b = scr.nextInt();
 * int sum = a+b;
 * 
 * System.outprintln(sum);
 */
