import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("DATA.in"));
        ArrayList<String> ans = new ArrayList<>();
        while (scn.hasNext()) {
            String s = scn.next();
            try {
                int n = Integer.parseInt(s);
            } catch (Exception e) {
                ans.add(s);
            }
        }
        Collections.sort(ans);
        for (String i : ans) System.out.print(i + " ");
    }
}
