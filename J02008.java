import java.util.Scanner;

public class J02008 {
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        long[] f = new long[1001];
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;
        for (int i = 2; i <= 1000; ++i) f[i] =  (i * f[i - 1] / gcd(i, f[i - 1]));
        while (t-- > 0) {
            int n = scn.nextInt();
            System.out.println(f[n])    ;
        }
    }
}
