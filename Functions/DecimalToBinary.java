package Functions;

public class DecimalToBinary {
    public static void printDecToBin(int decNum) {
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            int remainder = decNum % 2;
            binNum = binNum + (remainder * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;

        }
        System.out.println(binNum);
    }

    public static void main(String[] args) {
        printDecToBin(15);
    }
}
