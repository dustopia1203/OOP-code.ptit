import java.util.Scanner;

public class J01024 {
    public static boolean soTamPhan(String s) {
        for (int i = 0; i < s.length(); ++i)
            if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            String s = scn.next();
            if (soTamPhan(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
