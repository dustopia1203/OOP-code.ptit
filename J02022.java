import java.util.Scanner;

public class J02022 {
    static int n;
    static int[] a = new int[10];
    static int[] used = new int[10];
    public static boolean check() {
        for (int i = 1; i < n; i++) if (Math.abs(a[i] - a[i + 1]) == 1) return false;
        return true;
    }
    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (used[j] == 0) {
                used[j] = 1;
                a[i] = j;
                if (i == n) {
                    if (check()) {
                        for (int k = 1; k <= n; k++) System.out.print(a[k]);
                        System.out.println();
                    }
                }
                else Try(i + 1);
                used[j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            n = scn.nextInt();
            if (n <= 3) continue;
            Try(1);
        }
    }
}
