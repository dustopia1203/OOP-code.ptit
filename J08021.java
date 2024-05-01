import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            String s = scn.next();
            Stack<Integer> st = new Stack<>();
            int res = 0;
            st.push(-1);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') st.push(i);
                else {
                    st.pop();
                    if (!st.empty()) {
                        res = Math.max(res, i - st.peek());
                    } else st.push(i);
                }
            }
            System.out.println(res);
        }
    }
}
