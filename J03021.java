import java.util.Scanner;

public class J03021 {
    public static String getNumber(char c) {
        if (c <= 'c')
            return "2";
        else if (c <= 'f')
            return "3";
        else if (c <= 'i')
            return "4";
        else if (c <= 'l')
            return "5";
        else if (c <= 'o')
            return "6";
        else if (c <= 's')
            return "7";
        else if (c <= 'v')
            return "8";
        return "9";
    }

    public static boolean check(String s) {
        int l = s.length();
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            String s = scn.nextLine().toLowerCase();
            String numS = "";
            for (int i = 0; i < s.length(); i++) {
                numS += getNumber(s.charAt(i));
            }
            if (check(numS)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

