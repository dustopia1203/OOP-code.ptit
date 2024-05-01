import java.util.Scanner;

public class J03040 {
    public static String solve(String s) {
        s = s.substring(5).replace(".", "");
        boolean c1 = true, c2 = true, c3 = false, c4 = true;
        if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4)) c3 = true;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                if (s.charAt(i) >= s.charAt(i + 1)) c1 = false;
                if (s.charAt(i) != s.charAt(i + 1)) c2 = false;
            }
            if (s.charAt(i) != '8' && s.charAt(i) != '6') c4 = false;
        }
        if (c1 || c2 || c3 || c4) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            String s = scn.nextLine();
            System.out.println(solve(s));
        }
    }
}
