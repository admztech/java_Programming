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
        boolean isEven = isEven(0);
        System.out.println(isEven);
    }
}