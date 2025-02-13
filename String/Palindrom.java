package String;

public class Palindrom {
    public static boolean checkPalindrom(String str) {
        int length = str.length();
        int n = length - 1;
        int mid = length / 2;

        for (int i = 0; i < mid; i++) {

            if (str.charAt(i) != str.charAt(n - i)) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(checkPalindrom(str));

    }
}