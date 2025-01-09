import java.util.*;

public class JavaBasic {
    public static void main(String args[]) {

        Scanner scr = new Scanner(System.in);

        int a = 10;
        double b = 10.0000000000001;
        System.out.println(a == b);

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

    }
}