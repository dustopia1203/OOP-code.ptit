import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        Map<Integer, Integer> m = new TreeMap<>();
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        for (int i : a) {
            m.merge(i, 1, Integer::sum);
        }
        for (int i : m.keySet()) {
            System.out.println(i + " " + m.get(i));
        }
    }
}
