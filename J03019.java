import java.util.*;

public class J03019 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int i = 0, n = s.length();
        while (i < n) {
            char c = s.charAt(i);
            for (int j = i + 1; j < n; j++) if (c < s.charAt(j)) c = s.charAt(j);
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == c) {
                    System.out.print(c);
                    i = j;
                }
            }
            i++;
        }
    }
}
