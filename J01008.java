import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int test = 1;
        while (t-- > 0) {
            int n = scn.nextInt();
            System.out.print("Test " + test + ": ");
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    int cnt = 0;
                    while (n % i == 0) {
                        cnt++;
                        n /= i;
                    }
                    System.out.print(i + "(" + cnt + ") ");
                }
            }
            if (n > 1) System.out.print(n + "(1) ");
            System.out.println();
            test++;
        }
    }
}
