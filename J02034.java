import java.util.ArrayList;
import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int M = -1, n = scn.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        while (n-- > 0) {
            int x = scn.nextInt();
            M = Math.max(x, M);
            a.add(x);
        }
        boolean check = true;
        for (int i = 1; i <= M; i++) {
            if (!a.contains(i)) {
                System.out.println(i);
                check = false;
            }
        }
        if (check) System.out.println("Excellent!");
    }
}
