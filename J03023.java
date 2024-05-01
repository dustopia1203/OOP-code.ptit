import java.util.Scanner;

public class J03023 {
    public static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            default:
                return 1000;
        }
    }

    public static int calc(String s) {
        int res = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int pre = getValue(s.charAt(i - 1));
            int cur = getValue(s.charAt(i));
            if (pre < cur) {
                res += cur - 2 * pre;
            } else res += cur;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.next());
        while (t-- > 0) {
            String s = scn.next();
            System.out.println(calc(s));
        }
    }
}