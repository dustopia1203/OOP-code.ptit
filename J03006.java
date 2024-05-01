import java.util.Scanner;

public class J03006 {
    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i);
            if (tmp % 2 == 1) return false;
        }
        String rev_s = new StringBuilder(s).reverse().toString();
        return s.equals(rev_s);
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
