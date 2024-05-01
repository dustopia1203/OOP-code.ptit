import java.util.*;

public class J03010 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        Map<String, Integer> m = new HashMap<>();
        ArrayList<String> a = new ArrayList<>();
        while (n-- > 0) {
            String[] tok = scn.nextLine().trim().toLowerCase().split("\\s+");
            String res = "";
            res += tok[tok.length - 1];
            for (int i = 0; i < tok.length - 1; i++) res += tok[i].charAt(0);
            a.add(res);
            m.put(res, 0);
        }
        for (String i : a) {
            if (m.get(i) == 0) {
                m.put(i, 1);
                System.out.println(i + "@ptit.edu.vn");
            } else {
                m.put(i, m.get(i) + 1);
                System.out.println(i + m.get(i) + "@ptit.edu.vn");
            }
        }
    }
}
