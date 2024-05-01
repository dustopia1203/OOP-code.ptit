import java.util.Scanner;

public class J03022 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = "";
        while (scn.hasNextLine())
            s += scn.nextLine();
        s = s.replaceAll("\\s+", " ").trim();
        String[] tokens = s.split("[.?!]");
        for (int i = 0; i < tokens.length; i++) {
            String tmp = tokens[i].trim();
            tokens[i] = Character.toUpperCase(tmp.charAt(0)) + tmp.substring(1).toLowerCase();
        }
        for (String i : tokens) System.out.println(i);
    }
}
