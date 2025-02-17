package BitmaniPulation;

public class OddAndEven {
    public static void OddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        OddOrEven(10);

    }
}