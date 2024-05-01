import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static boolean check(char a, char b) {
        return (a == '{' && b == '}') || (a == '[' && b == ']') || (a == '(' && b == ')');
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            String s = scn.next();
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (st.empty()) st.push(s.charAt(i));
                else {
                    if (check(st.peek(), s.charAt(i))) st.pop();
                    else st.push(s.charAt(i));
                }
            }
            System.out.println(st.empty() ? "YES" : "NO");
        }
    }
}
