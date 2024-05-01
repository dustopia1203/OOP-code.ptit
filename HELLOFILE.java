import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("Hello.txt"));
        while (scn.hasNextLine())
            System.out.println(scn.nextLine());
    }
}
