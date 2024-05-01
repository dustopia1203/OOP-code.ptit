import java.util.Scanner;

public class J01026 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            long n = scn.nextLong();
            long x = (long) Math.sqrt(n);
            if (n == x * x) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
