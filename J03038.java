import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03038 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        Set<Character> se = new HashSet<>();
        for (int i = 0; i < s.length(); i++) se.add(s.charAt(i));
        System.out.println(se.size());
    }
}
