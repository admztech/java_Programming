public class Pattern {
    public static void main(String[] args) {
        int m = 6;
        int n = 3;
        int number = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println(" ");
        }
        // // Print chracter patter;
        // int n = 21;
        // char ch = 'A';
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }
        // Print Half pyramid
        /*
         * int n = 6;
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.err.print(j);
         * }
         * System.err.println();
         * }
         */
        /*
         * // Print Inverted-Start pattern
         * int n = 7;
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= (n - i + 1); j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */
        /*
         * // printing the Start
         * for (int i = 1; i <= 5; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */
    }
}
