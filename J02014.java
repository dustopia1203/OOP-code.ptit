import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] a = new int[n];
            int s = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scn.nextInt();
                s += a[i];
            }
            int ans = -1;
            int x = 0;
            for (int i = 0; i < n; i++) {
                if (x * 2 == s - a[i]) {
                    ans = i + 1;
                    break;
                }
                else x += a[i];
            }
            System.out.println(ans);
        }
    }
}
