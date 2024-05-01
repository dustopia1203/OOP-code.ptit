import java.util.Scanner;
import java.util.Stack;

public class J03027 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.empty()) st.push(s.charAt(i));
            else {
                if (st.peek() == s.charAt(i)) st.pop();
                else st.push(s.charAt(i));
            }
        }
        if (st.empty()) System.out.println("Empty String");
        else {
            String res = "";
            while (!st.empty()) {
                res += st.peek();
                st.pop();
            }
            res = new StringBuilder(res).reverse().toString();
            System.out.println(res);
        }
    }
}
