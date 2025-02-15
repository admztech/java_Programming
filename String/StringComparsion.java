package String;

import java.util.*;

public class StringComparsion {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        if (str1 == str2) {
            System.out.println("String are equal");
        } else {
            System.out.println("Not equals");
        }
        if (str4 == str3) {
            System.out.println("String are equal");
        } else {
            System.out.println("Not equal");
        }
        if (str1.equals(str3)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }

}