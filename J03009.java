import java.util.*;

public class J03009 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        while (n-- > 0) {
            String in1 = scn.nextLine();
            String in2 = scn.nextLine();
            ArrayList<String> s1 = new ArrayList<>(), s2 = new ArrayList<>();
            String[] tok = in1.split("\\s");
            s1.addAll(Arrays.asList(tok));
            tok = in2.split("\\s");
            s2.addAll(Arrays.asList(tok));
            Set<String> res = new TreeSet<>();
            for (String i : s1) {
                if (!s2.contains(i)) res.add(i);
            }
            for (String i : res) System.out.print(i + " ");
            System.out.println();
        }
    }
}
