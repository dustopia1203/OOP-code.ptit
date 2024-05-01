import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            long s = (long) n * (n + 1) / 2;
            System.out.println(s);
        }
    }
}
