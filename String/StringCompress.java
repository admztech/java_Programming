package String;

import java.util.*;

public class StringCompress {

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        int n = str.length();
        for (int i = 0; i < n; i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaabbbcccd";
        System.out.println(compress(str));

    }
}