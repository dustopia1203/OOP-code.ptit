import java.util.Scanner;

public class J01020 {
    public static boolean check(boolean[] a) {
        for (int i = 0; i < 10; i++) {
            if (!a[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            if (n == 0) {
                System.out.println("Impossible");
            } else {
                boolean[] a = new boolean[10];
                int k = 1;
                long res;
                while (true) {
                    long m = (long) n * k;
                    String s = Long.toString(m);
                    for (int i = 0; i < s.length(); i++) {
                        a[s.charAt(i) - '0'] = true;
                    }
                    if (check(a)) {
                        res = m;
                        break;
                    }
                    k++;
                }
                System.out.println(res);
            }
        }
    }
}
