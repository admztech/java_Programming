package Array;

public class kadaneAlo {
    public static void kadenAlgo(int num[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE; // minius infinity
        // to check if the all element is zero then retunr print the smallest negative
        // value
        int largestNegative = Integer.MIN_VALUE;
        boolean allNegative = true;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                largestNegative = Math.max(largestNegative, num[i]);
            } else {
                allNegative = false;
            }

        }
        if (allNegative) {
            System.out.println("The Max SubArray sum = " + largestNegative);
        } else {

            // kaden algo to check the max sum
            for (int i = 0; i < num.length; i++) {
                cs += num[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(ms, cs);
            }
            System.out.println("The Max Sub Array Sum = " + ms);
        }
    }

    public static void main(String[] args) {
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 }; // All negative numbers

        kadenAlgo(number);

    }
}
