import java.util.Scanner;

public class J03025 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            String s = scn.nextLine();
            int cnt = 0;
            boolean check = false;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) cnt++;
            }
            if (s.length() % 2 == 0) {
                if (cnt == 1) check = true;
            } else {
                if (cnt <= 1) check = true;
            }
            System.out.println(check ? "YES" : "NO");
        }
    }
}
