import java.util.ArrayList;
import java.util.Scanner;

public class J02011 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int step = 1;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) a.add(scn.nextInt());
        for (int i = 0; i < n - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < n; ++j) {
                if (a.get(min) > a.get(j)) min = j;
            }
            if (min != i) {
                int tmp = a.get(i);
                a.set(i, a.get(min));
                a.set(min, tmp);
            }
            System.out.printf("Buoc %d: ", step++);
            for (int x : a) System.out.print(x + " ");
            System.out.println();
        }
    }
}
