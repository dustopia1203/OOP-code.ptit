import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J03028 {
    public static void main(String[] args) {
        Map<Character, Integer> m = new HashMap<>();
        ArrayList<String> a = new ArrayList<>();
        for (char j = 'A'; j <= 'Z'; j++) {
            a.add(Character.toString(j));
            m.put(j, j - 'A');
        }
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.next());
        while (t-- > 0) {
            String s = scn.next();
            int n = s.length() / 2;
            String s1 = s.substring(0, n);
            String s2 = s.substring(n);
            int r_val1 = 0, r_val2 = 0;
            for (int i = 0; i < n; i++) {
                r_val1 += m.get(s1.charAt(i));
                r_val2 += m.get(s2.charAt(i));
            }
            String r_string1 = "", r_string2 = "";
            for (int i = 0; i < n; i++) {
                r_string1 += a.get((m.get(s1.charAt(i)) + r_val1) % 26);
                r_string2 += a.get((m.get(s2.charAt(i)) + r_val2) % 26);
            }
            String res = "";
            for (int i = 0; i < n; i++) {
                res += a.get((m.get(r_string1.charAt(i)) + m.get(r_string2.charAt(i))) % 26);
            }
            System.out.println(res);
        }
    }
}
