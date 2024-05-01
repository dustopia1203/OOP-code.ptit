import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J02026 {
    public static void Try(int i, int[] a, int n, int k, int[] b) {
        for (int j = b[i - 1] + 1; j <= n - k + i; j++) {
            b[i] = j;
            if (i == k) {
                for (int h = 1; h <= k; h++) System.out.print(a[b[h]] + " ");
                System.out.println();
            } else Try(i + 1, a, n, k, b);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt(), k = scn.nextInt();
            int[] a = new int[n + 1];
            int[] b = new int[k + 1];
            for (int i = 1; i <= n; i++) a[i] = scn.nextInt();
            Arrays.sort(a);
            Try(1, a, n, k, b);
        }
    }
}
