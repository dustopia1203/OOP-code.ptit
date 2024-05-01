import java.math.BigInteger;
import java.util.Scanner;

public class J03011 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            BigInteger a = scn.nextBigInteger(), b = scn.nextBigInteger();
            System.out.println(a.gcd(b));
        }
    }
}
