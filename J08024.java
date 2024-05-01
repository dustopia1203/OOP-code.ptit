import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            Queue<Integer> q = new LinkedList<>();
            q.add(9);
            while (true) {
                int tmp = q.remove();
                if (tmp % n == 0) {
                    System.out.println(tmp);
                    break;
                }
                int num1 = tmp * 10;
                if (num1 % n == 0) {
                    System.out.println(num1);
                    break;
                }
                q.add(num1);
                int num2 = tmp * 10 + 9;
                if (num2 % n == 0) {
                    System.out.println(num2);
                    break;
                }
                q.add(num2);
            }
        }
    }
}
