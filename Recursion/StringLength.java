    package Recursion;

    import java.util.*;

    public class StringLength {
        public static int findStrLength(String str) {
            return findLength(str, 0);
        }

        public static int findLength(String str, int i) {
            if (i == str.length()) {
                return 0;
            }
            return 1 + findLength(str, i + 1);
        }

        public static void main(String[] args) {
            System.out.println(findStrLength("Hello"));

        }
    }