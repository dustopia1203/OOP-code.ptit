import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05033 {
    static class Time implements Comparable<Time>{
        private int hour, minute, second;

        public Time(int h, int m, int s) {
            hour = h;
            minute = m;
            second = s;
        }

        @Override
        public String toString() {
            return hour + " " + minute + " " + second;
        }

        @Override
        public int compareTo(Time o) {
            if (this.hour > o.hour) return 1;
            else if (this.hour == o.hour) {
                if (this.minute > o.minute) return 1;
                else if (this.minute == o.minute) {
                    return Integer.compare(this.second, o.second);
                }
                else return -1;
            }
            else return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Time> a = new ArrayList<>();
        int n = scn.nextInt();
        while (n-- > 0) {
            a.add(new Time(scn.nextInt(), scn.nextInt(), scn.nextInt()));
        }
        Collections.sort(a);
        for (Time i : a) System.out.println(i);
    }
}
