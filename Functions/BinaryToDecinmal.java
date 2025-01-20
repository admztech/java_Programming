package Functions;

public class BinaryToDecinmal {
    public static void binaToDec(int binNum) {
        int binary = binNum;
        int pow = 0;
        int dec = 0;
        while (binNum > 0) {

            int lastDigit = binNum % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));

            binNum = binNum / 10;
            pow++;
        }
        System.out.println("Decimal of " + binary + " = " + dec);

    }

    public static void main(String[] args) {
        binaToDec(1111);
    }
}
