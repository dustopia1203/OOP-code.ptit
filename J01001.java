import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (a <= 0 || b <= 0) System.out.println("0");
        else {
            int p = 2 * (a + b);
            int s = a * b;
            System.out.printf("%d %d", p, s);
        }
    }
}
