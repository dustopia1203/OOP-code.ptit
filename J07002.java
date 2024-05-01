import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn  = new Scanner(new File("DATA.in"));
        long res = 0;
        while (scn.hasNext()) {
            try {
                int tmp = Integer.parseInt(scn.next());
                res += tmp;
            } catch (NumberFormatException e) {

            }
        }
        System.out.println(res);
    }
}
