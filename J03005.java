import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        while (n-- > 0) {
            String s = scn.nextLine().trim().toLowerCase();
            String[] tok = s.split("\\s+");
            String res = "";
            for (int i = 1; i < tok.length - 1; i++)
                res += String.valueOf(tok[i].charAt(0)).toUpperCase() + tok[i].substring(1) + " ";
            res += String.valueOf(tok[tok.length - 1].charAt(0)).toUpperCase() + tok[tok.length - 1].substring(1);
            res += ", " + tok[0].toUpperCase();
            System.out.println(res);
        }
    }
}
