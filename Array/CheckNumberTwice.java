package Array;

public class CheckNumberTwice {
    public static boolean checkNumberTwice(int number[]) {
        int n = number.length;
        for (int i = 0; i < n; i++) {
            int key = number[i];
            for (int j = i + 1; j < n; j++) {
                if (key == number[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = { 1,1,1, 2, 3, 4 };
        System.out.println(checkNumberTwice(num));

    }
}
