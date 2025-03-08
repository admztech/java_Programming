package BitmaniPulation;

import java.util.*;

public class NumToHex {
    public static String toHex(int n) {
        if (n == 0) {
            return "0";
        }
        char[] hexChar = "0123456789abcdef".toCharArray();
        StringBuilder res = new StringBuilder("");
        for(int i=0; i<8 && n!=0; i++){
            int digit = n&15;
            res.append(hexChar[digit]);
            n = n>>4
        }

    }

    public static void main(String[] args) {
        int num = -1;
        System.out.println(toHex(num));

    }
}