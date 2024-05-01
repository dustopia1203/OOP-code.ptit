import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        while (n-- > 0) {
            String s = scn.nextLine().trim().toLowerCase();
            String[] tok = s.split("\\s+");
            for (String i : tok) System.out.print(String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ");
            System.out.println();
        }
    }
}
