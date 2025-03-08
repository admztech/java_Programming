package BitmaniPulation;

import java.util.*;

public class UperTOLower {
    public static void main(String args[]) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' ') + " ");
        }
    }
}