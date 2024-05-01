import java.math.BigInteger;
import java.util.Scanner;

public class J03014 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BigInteger a = new BigInteger(scn.nextLine()), b = new BigInteger(scn.nextLine());
        System.out.println(a.add(b));
    }
}
