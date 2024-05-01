import java.util.Arrays;
import java.util.Scanner;

public class J02102 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n * n];
        for (int i = 0; i < n * n; i++) a[i] = scn.nextInt();
        Arrays.sort(a);
        int[][] b = new int[n][n];
        int c1 = 0, c2 = n - 1, r1 = 0, r2 = n - 1, idx = 0;
        while (c1 <= c2 && r1 <= r2) {
            for (int i = c1; i <= c2; i++) b[r1][i] = a[idx++];
            r1++;
            for (int i = r1; i <= r2; i++) b[i][c2] = a[idx++];
            c2--;
            if (c1 <= c2) {
                for (int i = c2; i >= c1; i--) b[r2][i] = a[idx++];
                r2--;
            }
            if (r1 <= r2) {
                for (int i = r2; i >= r1; i--) b[i][c1] = a[idx++];
                c1++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
