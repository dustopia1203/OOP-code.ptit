import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class J07085 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ot = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) ot.readObject();
        ot.close();
        for (String x : a) {
            String s = "";
            int cnt = 0;
            for (int i = 0; i < x.length(); ++i)
                if (x.charAt(i) >= '0' && x.charAt(i) <= '9') {
                    s += x.charAt(i);
                    cnt += (x.charAt(i) - '0');
                }
            BigInteger b = new BigInteger(s);
            System.out.printf("%s %d\n", b, cnt);
        }
    }
}
