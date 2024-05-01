import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J02009 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = scn.nextInt();
            a[i][1] = scn.nextInt();
        }
        Arrays.sort(a, Comparator.comparingInt(o -> o[0]));
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (a[i][0] > res) res = a[i][0];
            res += a[i][1];
        }
        System.out.println(res);
    }
}
