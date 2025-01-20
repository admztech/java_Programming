package Functions;

import java.util.*;

public class AverageNumber {
    public static int AvgThreeNum(int x, int y, int z) {
        return ((x + y + z) / 3);
    }

    public static void main(String argrs[]) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the first  number");
        int a = scr.nextInt();
        System.out.println("Enter the Second number");
        int b = scr.nextInt();
        System.out.println("Enter the Third Number");
        int c = scr.nextInt();
        System.out.println("The average of value is " + AvgThreeNum(a, b, c));

    }
}
