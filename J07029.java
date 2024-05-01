import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class J07029 {
    public  static boolean check(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        Map<Integer, Integer> m = new TreeMap<>(Collections.reverseOrder());
        for (int i : a) {
            if (check(i)) m.merge(i, 1, Integer::sum);
        }
        int cnt = 0;
        for (int i : m.keySet()) {
            System.out.println(i + " " + m.get(i));
            cnt++;
            if (cnt == 10) break;
        }
    }
}
