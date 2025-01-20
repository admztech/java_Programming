package Functions;

import java.util.*;

public class AverageNumber {
    public static int AvgThreeNum(int a, int b, int c) {
        return ((a + b + c) / 3);
    }

    public static void main(String argrs[]) {
        int avg = AvgThreeNum(10, 20, 30);
        System.out.println(avg);

    }
}
