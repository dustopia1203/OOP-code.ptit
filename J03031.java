import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03031 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            String s = scn.next();
            int k = scn.nextInt();
            Set<Character> sc = new HashSet<>();
            for (int i = 0; i < s.length(); i++) sc.add(s.charAt(i));
            if (k >= 26 - sc.size()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
