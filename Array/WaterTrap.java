package Array;

import java.util.*;

public class WaterTrap {
    public static int trappedRainwater(int height[]) {
        int n = height.length;
        // leftMAx array
        int leftMAx[] = new int[height.length];
        leftMAx[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMAx[i] = Math.max(height[i], leftMAx[i - 1]);
        }
        // right Max
        int rightMax[] = new int[height.length];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);

        }
        // calculator the trapping water
        int trapWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMAx[i], rightMax[i]);
            trapWater += waterLevel - height[i];
        }
        return trapWater;
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 6, 3, 2, 5 };
        System.out.println(trappedRainwater(height));
    }

}