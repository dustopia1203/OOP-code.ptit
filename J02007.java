import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int tc = 1;
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] a = new int[n], f = new int[10001];
            for (int i = 0; i < n; ++i) {
                a[i] = scn.nextInt();
                f[a[i]]++;
            }
            System.out.printf("Test %d:\n", tc++);
            for (int i = 0; i < n; ++i) {
                if (f[a[i]] > 0) {
                    System.out.printf("%d xuat hien %d lan\n", a[i], f[a[i]]);
                    f[a[i]] = 0;
                }
            }
        }
    }
}
