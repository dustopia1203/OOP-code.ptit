import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J02025 {
    public static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void Try(int i, int[] a, int sum, String res) {
        if (prime(sum)) System.out.println(res);
        for (int j = 0; j < i; j++) Try(j, a, sum + a[j], res + a[j] + " ");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = scn.nextInt();
            Arrays.sort(a);
            Try(n, a, 0, "");
        }
    }
}
