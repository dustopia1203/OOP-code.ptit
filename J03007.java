import java.util.Scanner;

public class J03007 {
    public static boolean check(String s) {
        if (s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8')
            return false;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += s.charAt(i) - '0';
        }
        if (res % 10 != 0) return false;
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        while (n-- > 0) {
            String s = scn.nextLine();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
