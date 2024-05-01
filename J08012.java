import java.util.ArrayList;
import java.util.Scanner;

public class J08012 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) g[i] = new ArrayList<>();
        int x, y;
        for (int i = 0; i < n - 1; i++) {
            x = scn.nextInt();
            y = scn.nextInt();
            g[x].add(y);
            g[y].add(x);
        }
        int cnt = 0;
        boolean check = true;
        for (int i = 1; i < n; i++) {
            if (cnt > 1) {
                check = false;
                break;
            }
            if (g[i].size() > 1) cnt++;
        }
        System.out.println(check ? "Yes" : "No");
    }
}
