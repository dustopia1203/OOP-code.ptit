import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            String[] s = scn.nextLine().split("\\s");
            for (String i : s) {
                i = new StringBuilder(i).reverse().toString();
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
