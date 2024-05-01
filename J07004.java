import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("DATA.in"));
        int[] arr = new int[1000];
        while (scn.hasNextInt()) {
            arr[scn.nextInt()]++;
        }
        for (int i = 0; i < 1000; ++i)
            if (arr[i] > 0)
                System.out.println(i + " " + arr[i]);
    }
}
