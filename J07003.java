import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("DATA.in"));
        String s =  scn.nextLine();
        int len = s.length();
        while (len > 1) {
            String s1 = s.substring(0, len / 2), s2 = s.substring(len / 2);
            BigInteger a = new BigInteger(s1), b = new BigInteger(s2);
            s = a.add(b).toString();
            System.out.println(s);
            len = s.length();
        }
    }
}
