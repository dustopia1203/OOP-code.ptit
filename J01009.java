import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        long[] f = new long[21];
        f[1] = 1;
        for (int i = 2; i <= 20; i++)
            f[i] = f[i - 1] * i;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long res = 0;
        for (int i = 1; i <= n; i++)
            res += f[i];
        System.out.println(res);
    }
}
