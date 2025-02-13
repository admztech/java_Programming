package String;

import java.util.*;

public class Strings {
    public static void printChar(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        char ch[] = { 'a', 'b', 'c' };
        String str = "abcd";
        String str2 = new String("xzy");
        Scanner sc = new Scanner(System.in);
        System.out.println("endter you names");
        System.out.println("Enter fulle stence about you ");
        String fullname = sc.nextLine();
        System.out.println(fullname);
        System.out.println(fullname.length());
        printChar(fullname);

    }
}