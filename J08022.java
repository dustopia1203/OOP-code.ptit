import java.util.Scanner;
import java.util.Stack;

public class J08022 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = scn.nextInt();
            Stack<Integer> st = new Stack<>();
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                if (st.empty()) st.push(i);
                else {
                    while (!st.empty() && a[i] > a[st.peek()]) {
                        ans[st.peek()] = a[i];
                        st.pop();
                    }
                    st.push(i);
                }
            }
            while (!st.empty()) {
                ans[st.peek()] = -1;
                st.pop();
            }
            for (int i = 0; i < n; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
