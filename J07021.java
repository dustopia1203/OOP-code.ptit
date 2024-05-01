import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("DATA.in"));
        String s = scn.nextLine();
        while (!s.equals("END")) {
            String[] tokens = s.toLowerCase().trim().split("\\s+");
            for (String i : tokens) {
                i = Character.toUpperCase(i.charAt(0)) + i.substring(1);
                System.out.print(i + " ");
            }
            System.out.println();
            s = scn.nextLine();
        }
    }
}
