import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        long[] f = new long[93];
        f[1] = f[2] = 1;
        for (int i = 3; i <= 92; i++)
            f[i] = f[i - 1] + f[i - 2];
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            System.out.println(f[n]);
        }
        scn.close();
    }
}
