import java.util.ArrayList;
import java.util.Scanner;

public class J03017 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            String s = scn.nextLine();
            ArrayList<Integer> a = new ArrayList<>();
            a.add(-1);
            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                a.add(i);
                while (a.size() > 3 && s.charAt(a.get(a.size() - 3)) == '1' && s.charAt(a.get(a.size() - 2)) == '0' && s.charAt(a.get(a.size() - 1)) == '0') {
                    a.remove(a.get(a.size() - 1));
                    a.remove(a.get(a.size() - 1));
                    a.remove(a.get(a.size() - 1));
                }
                ans = Math.max(ans, i - a.get(a.size() - 1));
            }
            System.out.println(ans);
        }
    }
}
