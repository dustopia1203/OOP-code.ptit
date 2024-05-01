import java.util.Scanner;

public class J03035 {
    public static long solution(String a, String b) {
        int n = a.length();
        long res = 0;
        char x, y;
        for (int i = 0; i < n; i++) {
            x = a.charAt(i);
            y = b.charAt(i);
            if (x != y) {
                if (x == '?') {
                    res += ('9' - y) * calc(a, i + 1);
                } else {
                    if (x > y) return res + calc(a, i + 1);
                    return res;
                }
            }
        }
        return res;
    }

    public static long calc(String s, int n) {
        long res = 1;
        for (int i = n; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                res *= 10;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            String a = scn.nextLine(), b = scn.nextLine();
            System.out.println(solution(a, b));
        }
    }
}
