import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            boolean check = true;
            String s = scn.next();
            for (int i = 1; i < s.length(); ++i) {
                if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 1) {
                    check = false;
                    break;
                }
            }
            if (check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
