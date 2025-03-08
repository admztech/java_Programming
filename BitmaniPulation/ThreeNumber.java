package BitmaniPulation;

import java.util.*;

public class ThreeNumber {
    public static int uniqueOne(int arr[]) {
        int tn = Integer.MAX_VALUE;
        int tnp1 = 0, tnp2 = 0;
        for (int i = 0; i < arr.length; i++) {
            int cwtn = arr[i] & tn;
            int cwtn1 = arr[i] & tnp1;
            int cwtnp2 = arr[i] & tnp2;

            tn = tn & (~cwtn);
            tnp1 = tnp1 | cwtn;

            tnp1 = tnp1 & (~cwtn1);
            tnp2 = tnp2 | cwtn1;

            tnp2 = tnp2 & (~cwtnp2);
            tn = tn | cwtnp2;
        }
        return tnp1;
    }

    public static void main(String[] args) {
        int num[] = { 36, 50, 24, 56, 36, 24, 36, 24, 50, 50 };

        System.out.println(uniqueOne(num));
    }
}