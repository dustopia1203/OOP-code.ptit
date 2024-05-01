import java.util.Scanner;

public class J01025 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a1_x = scn.nextInt();
        int a1_y = scn.nextInt();
        int b1_x = scn.nextInt();
        int b1_y = scn.nextInt();
        int a2_x = scn.nextInt();
        int a2_y = scn.nextInt();
        int b2_x = scn.nextInt();
        int b2_y = scn.nextInt();
        int x1 = Math.min(a1_x, a2_x);
        int y1 = Math.min(a1_y, a2_y);
        int x2 = Math.max(b1_x, b2_x);
        int y2 = Math.max(b1_y, b2_y);
        int x = Math.max(y2 - y1, x2 - x1);
        System.out.println(x * x);
    }
}
