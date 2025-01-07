import java.util.Scanner;

public class Assigment {
    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);

        // Question 1

        System.out.println("Enter first number");
        int a = scr.nextInt();
        System.out.println("Enter first number");
        int b = scr.nextInt();
        System.out.println("Enter first number");
        int c = scr.nextInt();

        float average = (a + b + c) / 3.0f;

        System.out.println("The average of three number is :" + average);

        // Q2: The Aread of the Sequare

        System.out.println("Enter the side  of the Sequare value");
        float s = scr.nextFloat();
        float areSeq = s * s;
        System.out.println("Thare area of the Sequare is : " + areSeq);

        // Total biles with 18% gst cost on item

        System.out.println("Enter a Pencil price");
        float pencil = scr.nextFloat();
        System.out.println("Enter a Pen  price");
        float pen = scr.nextFloat();
        System.out.println("Enter a Eraser price");
        float eraser = scr.nextFloat();

        float totalAmount = pencil + pen + eraser;
        System.out.println("The total Amount:" + totalAmount);
        float gstTax = totalAmount * 0.18f;
        float bill = totalAmount + gstTax;
        System.out.println("The total cost with 18% GST : " + bill);
    }
}
