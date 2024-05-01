import java.util.Scanner;
import java.util.Stack;

public class JKT014 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = scn.nextInt();
            Stack<Integer> st = new Stack<>();
            int[] ans = new int[n];
            ans[0] = 1;
            st.push(0);
            for (int i = 1; i < n; i++) {
                while (!st.empty() && a[st.peek()] <= a[i])
                    st.pop();
                ans[i] = st.empty() ? i + 1 : i - st.peek();
                st.push(i);
            }
            for (int i = 0; i < n; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
