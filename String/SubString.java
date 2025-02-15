package String;

import java.util.*;

public class SubString {

    public static String subString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void printSubString(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int star = i;
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.print(", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String str = "geek";
        System.out.println(subString(str, 0, 3));
        String sub = str.substring(0, 3);
        System.out.println(sub);
    }

}