public class OperatorPreced {

    public static void main(String[] args) {

        int x = 200, y = 50, z = 100;
        if (x > y && y > z) {
            System.out.println("Hello");
        }
        if (z > y && z < x) {
            System.out.println("JAva");
        }
        if ((y + 200) < x && (y + 150) < z) {
            System.out.println("Hello Java");
        }
        System.out.println(x + " " + y + " " + z);
        int exp = 4 / 3 * (x + 34) + 9 * (x + y + z) + (3 + y * (2 + x) / (x + y * z));
        System.out.println(exp);

        x = 10;
        y = 5;
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}