import java.util.Arrays;
import java.util.Scanner;

public class J02016 {
    public static boolean binarySearch(long[] a, int l, int r, long val) {
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == val) return true;
            else if (a[m] < val) l = m + 1;
            else r = m - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scn.nextInt();
                a[i] *= a[i];
            }
            Arrays.sort(a);
            boolean check = false;
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    if (binarySearch(a, j + 1, n - 1, a[i] + a[j])) {
                        check = true;
                        break;
                    }
                }
                if (check) break;
            }
            System.out.println(check ? "YES" : "NO");
        }
    }
}
