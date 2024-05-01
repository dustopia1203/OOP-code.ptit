import java.util.Scanner;

public class J02004 {
    public static boolean check(int n, int[] a) {
        int i = 0;
        while (i <= n / 2) {
            if (a[i] != a[n - i - 1]) return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = scn.nextInt();
            if (check(n, a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
