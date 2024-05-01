import java.util.Scanner;

public class J02006 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x, n = scn.nextInt(), m = scn.nextInt();
        int[] c = new int[1001];
        for (int i = 0; i < n; ++i) {
            x = scn.nextInt();
            c[x] = 1;
        }
        for (int i = 0; i < m; ++i) {
            x = scn.nextInt();
            c[x] = 1;
        }
        for (int i = 1; i <= 1000; ++i) if (c[i] == 1) System.out.printf("%d ", i);
    }
}
