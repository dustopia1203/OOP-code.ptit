import java.nio.channels.Pipe;
import java.util.Scanner;

public class J04001 {
    static class Point {
        private double x, y;

        Point() {
            this.x = this.y = 0;
        }

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        Point(Point p) {
            this.x = p.x;
            this.y = p.y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double distance(Point secondPoint) {
            return Math.sqrt(Math.pow(x - secondPoint.getX(), 2) + Math.pow(y - secondPoint.getY(), 2));
        }

        public double distance(Point p1, Point p2) {
            return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            double a = scn.nextDouble(), b = scn.nextDouble(), c = scn.nextDouble(), d = scn.nextDouble();
            Point p1 = new Point(a, b), p2 = new Point(c, d);
            System.out.printf("%.4f\n", p1.distance(p2));
        }
    }
}
