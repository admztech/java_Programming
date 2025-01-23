package Array;

public class linearSearch {

    public static int linearSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(String Str[], String key) {
        for (int i = 0; i < Str.length; i++) {
            if (Str[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int mumber[] = { 1, 2, 3, 4, 5, 6, 7, 10, 12, 15 };
        String menu[] = { "dose", "chale", "bhature", "samosa" };
        String order = "dose";
        int index = linearSearch(menu, order);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key is fount at index: " + index);
        }

    }
}