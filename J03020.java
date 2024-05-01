import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J03020 {
    public static boolean check(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Map<String, Integer> m = new HashMap<>();
        ArrayList<String> a = new ArrayList<>();
        int maxLength = 0;
        while (scn.hasNext()) {
            String s = scn.next();
            if (check(s)) {
                if (!a.contains(s)) a.add(s);
                m.merge(s, 1, Integer::sum);
                if (s.length() > maxLength) maxLength = s.length();
            }
        }
        for (String i : a) {
            if (i.length() == maxLength) System.out.println(i + " " + m.get(i));
        }
    }
}
