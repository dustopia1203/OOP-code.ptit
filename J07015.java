import java.io.*;
import java.util.ArrayList;

public class J07015 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); ++i) if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) in.readObject();
        int[] f = new int[10001];
        for (Integer i : arr) if (isPrime(i)) f[i]++;
        for (int i = 0; i <= 10000; ++i) if (f[i] > 0) System.out.println(i + " " + f[i]);
    }
}
