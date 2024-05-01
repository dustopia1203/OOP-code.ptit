import java.util.Scanner;

public class J02101 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    a[i][j] = scn.nextInt();
            int cnt = 0;
            while (cnt < n) {
                if (cnt % 2 == 0) {
                    for (int i = 0; i < n; i++) System.out.print(a[cnt][i] + " ");
                } else {
                    for (int i = n - 1; i >= 0; i--) System.out.print(a[cnt][i] + " ");
                }
                cnt++;
            }
            System.out.println();
        }
    }
}
