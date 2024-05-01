import java.math.BigInteger;
import java.util.Scanner;

public class J01021 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BigInteger a, b;
        while (true) {
            a = scn.nextBigInteger();
            b = scn.nextBigInteger();
            if (a.compareTo(BigInteger.valueOf(0)) == 0 && b.compareTo(BigInteger.valueOf(0)) == 0) break;
            BigInteger c = a.modPow(b, BigInteger.valueOf(1000000007L));
            System.out.println(c);
        }
    }
}
