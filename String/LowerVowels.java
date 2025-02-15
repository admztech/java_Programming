package String;

import java.util.*;

public class LowerVowels {
    public static int vowelCounts(String str) {
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String str = input.next();
        System.out.println("Total number of Lower vowels is : " + vowelCounts(str));
        String str1 = "ShradhaDidi";
        String str2 = "Apna college";
        String str3 = "ShradhaDidi";
        System.out.println(str1.equals(str2) + " " + str1.equals(str3));
    }

}