package Pattern;

public class HollowRectangle {
    public static void main(String[] args) {
        int n = 4;
        int m = n + 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= m; j++) {
                if ((i == 1 || j == 1) || (j == m || i == n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
