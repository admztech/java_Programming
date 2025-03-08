package BitmaniPulation;

import java.util.*;

public class RightMostSet {
    public static void main(String args[]) {
        int x = 72;
        int rmsb = x & -x;
        System.out.println(Integer.toBinaryString(rmsb));
    }
}