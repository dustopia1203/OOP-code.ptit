import java.math.BigInteger;
import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while (t-- > 0) {
            String a = sc.next();
            BigInteger x = new BigInteger(a);
            BigInteger y = new BigInteger("11");
            BigInteger z = new BigInteger("0");
            if (x.mod(y).equals(z)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}