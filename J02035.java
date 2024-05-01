import java.util.Scanner;

public class J02035 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = scn.nextInt();
            int idx = -1;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    idx = i;
                    break;
                }
            }
            System.out.println(idx == -1 ? "0" : idx + 1);
        }
    }
}
