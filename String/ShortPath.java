package String;

public class ShortPath {
    public static float displacement(String path) {
        int x = 0;
        int y = 0;
        int length = path.length();
        for (int i = 0; i < length; i++) {
            char dir = path.charAt(i);
            if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'S') {
                y--;
            }
        }
        System.out.println("Value of x: " + x + " y : " + y);
        y = y * y;
        x = x * x;
        int distance = y + x;
        float shorpath = (float) Math.sqrt(distance);
        return shorpath;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println(displacement(path));

    }
}