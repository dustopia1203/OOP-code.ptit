import java.util.Scanner;

public class J03026 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            String a = scn.nextLine(), b = scn.nextLine();
            System.out.println(a.equals(b) ? "-1" : Math.max(a.length(), b.length()));
        }
    }
}
