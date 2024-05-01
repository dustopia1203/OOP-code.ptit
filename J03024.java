import java.util.Scanner;

public class J03024 {
    public static String check(String s) {
        if (s.startsWith("0")) return "INVALID";
        int len = s.length();
        int oddCnt = 0, evenCnt;
        for (int i = 0; i < len; i++) {
            if (!Character.isDigit(s.charAt(i))) return "INVALID";
            int c = s.charAt(i) - '0';
            oddCnt += (c & 1);
        }
        evenCnt = len - oddCnt;
        if (len % 2 == 0 && evenCnt > oddCnt) return "YES";
        if (len % 2 == 1 && evenCnt < oddCnt) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            String s = scn.nextLine();
            System.out.println(check(s));
        }
    }
}
