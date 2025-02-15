package String;

import java.util.*;

public class CompareTo {
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" };
        int n = fruits.length;
        String larges = fruits[0];
        for (int i = 0; i < n; i++) {
            if (larges.compareToIgnoreCase(fruits[i]) < 0) {
                larges = fruits[i];
            }
        }
        System.out.println("The larges String is " + larges);
    }
}