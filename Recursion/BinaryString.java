package Recursion;

import java.util.*;

public class BinaryString {
    public static void binaryString(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        //
        // if (lastplace == 0) {
        // binaryString(n - 1, 0, str.append("0"));
        // binaryString(n - 1, 1, str.append("1"));
        // } else {
        // binaryString(n - 1, 0, str.append("0"));
        // }
        binaryString(n - 1, 0, str + "0");
        if (lastplace == 0) {
            binaryString(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        binaryString(3, 0, "");

    }
}