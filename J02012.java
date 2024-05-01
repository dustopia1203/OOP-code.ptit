import java.util.ArrayList;
import java.util.Scanner;

public class J02012 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) a.add(scn.nextInt());
        for (int i = 0; i < n; ++i) {
            int key = a.get(i);
            int k = i - 1;
            while (k >= 0 && key < a.get(k)) {
                a.set(k + 1, a.get(k));
                k--;
            }
            a.set(k + 1, key);
            System.out.printf("Buoc %d: ", i);
            for (int j = 0; j <= i; ++j) System.out.print(a.get(j) + " ");
            System.out.println();
        }
    }
}
