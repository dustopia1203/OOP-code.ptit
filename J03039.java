import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            String[] s = scn.nextLine().split("\\s");
            BigInteger a = new BigInteger(s[0]);
            BigInteger b = new BigInteger(s[1]);
            if (a.mod(b).equals(new BigInteger("0")) || b.mod(a).equals(new BigInteger("0"))) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
