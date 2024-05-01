import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JKT013 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            ArrayList<String> a = new ArrayList<>();
            Queue<String> q = new LinkedList<>();
            q.add("6");
            q.add("8");
            int cnt = 0;
            while (true) {
                String tmp = q.remove();
                if (tmp.length() > n) break;
                a.add(tmp);
                cnt++;
                q.add(tmp + "6");
                q.add(tmp + "8");
            }
            System.out.println(cnt);
            for (int i = a.size() - 1; i >= 0; i--) System.out.print(a.get(i) + " ");
            System.out.println();
        }
    }
}
