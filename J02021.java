import java.util.ArrayList;
import java.util.Scanner;

public class J02021 {
    static int n, k;
    static int[] a = new int[10];
    static int cnt = 0;

    public static void Try(int i) {
        for (int j = a[i - 1] + 1; j <= n - k + i; j++) {
            a[i] = j;
            if (i == k) {
                String tmp;
                for (int m = 1; m <= k; m++) System.out.print(a[m]);
                System.out.print(" ");
                cnt++;
            }
            else Try(i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        k = scn.nextInt();
        Try(1);
        System.out.printf("\nTong cong co %d to hop\n", cnt);
    }
}
