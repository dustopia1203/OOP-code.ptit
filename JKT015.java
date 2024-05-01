import java.util.Scanner;
import java.util.Stack;

public class JKT015 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Character> s1 = new Stack<>(), s2 = new Stack<>();
        String s = scn.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                if (!s1.empty()) s1.pop();
            } else if (s.charAt(i) == '<') {
                if (!s1.empty()) s2.push(s1.pop());
            } else if (s.charAt(i) == '>') {
                if (!s2.empty()) s1.push(s2.pop());
            } else s1.push(s.charAt(i));
        }
        while (!s1.empty()) s2.push(s1.pop());
        while (!s2.empty()) System.out.print(s2.pop());
        System.out.println();
    }
}
