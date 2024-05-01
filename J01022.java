import java.util.Scanner;

public class J01022 {
    public static void main(String[] args) {
        long[] f = new long[93];
        f[0] = 0;
        f[1] = f[2] = 1;
        for (int i = 3; i < 93; ++i) f[i] = f[i - 1] + f[i - 2];
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int b = scn.nextInt();
            long a = scn.nextLong();
            while (b > 2) {
                if (a <= f[b - 2]) {
                    b -= 2;
                }
                else {
                    a -= f[b - 2];
                    b -= 1;
                }
            }
            if (b == 1) System.out.println("0");
            else System.out.println("1");
        }
    }
}
