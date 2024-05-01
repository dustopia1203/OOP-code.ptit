import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            BigInteger a = new BigInteger(scn.nextLine()), b = new BigInteger(scn.nextLine());
            System.out.println(a.multiply(b).divide(a.gcd(b)));
        }
    }
}
