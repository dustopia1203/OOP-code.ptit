import java.util.Scanner;
import java.util.Stack;

public class J02017 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int x = scn.nextInt();
            if (st.empty()) st.push(x);
            else {
                if ((st.peek() + x) % 2 == 0) st.pop();
                else st.push(x);
            }
        }
        System.out.println(st.size());
    }
}
