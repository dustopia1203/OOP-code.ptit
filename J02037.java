import java.util.Scanner;

public class J02037 {
    public static boolean check(String[] s) {
        int n = s.length;
        int even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            int c = Integer.parseInt(s[i]);
            if (c % 2 == 0) even++;
            else odd++;
        }
        return ((n % 2 == 0 && even > odd) || (n % 2 == 1 && odd > even));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            String[] s = scn.nextLine().split("\\s");
            System.out.println(check(s) ? "YES" : "NO");
        }
    }
}
