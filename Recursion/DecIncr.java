package Recursion;

public class DecIncr {
    public static void decInc(int n) {
        // dcreasiong

    }

    public static void decr(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        decr(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {

        decr(5);
    }
}