import java.math.BigInteger;
import java.util.Scanner;

public class J03012 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            BigInteger a = scn.nextBigInteger(), b = scn.nextBigInteger();
            System.out.println(a.add(b));
        }
    }
}
