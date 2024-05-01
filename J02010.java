import java.util.ArrayList;
import java.util.Scanner;

public class J02010 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int step = 1;
        for (int i = 0; i < n; ++i) a.add(scn.nextInt());
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (a.get(i) > a.get(j)) {
                    int tmp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, tmp);
                }
            }
            System.out.printf("Buoc %d: ", step++);
            for (int x : a) System.out.print(x + " ");
            System.out.println();
        }
    }
}
