import java.util.Scanner;

public class J03008 {
    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' != 2
                    && s.charAt(i) - '0' != 3
                    && s.charAt(i) - '0' != 5
                    && s.charAt(i) - '0' != 7) return false;
        }
        String rev = new StringBuffer(s).reverse().toString();
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
