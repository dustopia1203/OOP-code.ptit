import java.io.*;
import java.util.*;

class Persons implements Comparable<Persons> {
    private String name;
    private String lastName;
    private String firstName;
    private String initial;

    public Persons(String name) {
        this.name = name;
        String[] tmp = name.split("\\s+");
        this.initial = "" + tmp[0].charAt(0);
        for (int i = 1; i < tmp.length; ++i) this.initial += ("." + tmp[i].charAt(0));
        this.lastName = tmp[0];
        this.firstName = tmp[tmp.length - 1];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    @Override
    public int compareTo(Persons o) {
        if (!this.firstName.equals(o.firstName)) return this.firstName.compareTo(o.firstName);
        return this.lastName.compareTo(o.lastName);
    }
}

public class J07071 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Persons> a = new ArrayList<>();
        for (int i = 0; i < n; ++i) a.add(new Persons(sc.nextLine()));
        Collections.sort(a);
        int m = sc.nextInt();
        while (m-- > 0) {
            String s = sc.next();
            int pos = -1;
            for (int i = 0; i < s.length(); ++i)
                if (s.charAt(i) == '*') {
                    pos = i;
                    break;
                }
            for (Persons x : a)
                if (s.substring(0, pos).equals(x.getInitial().substring(0, pos)) && s.substring(pos + 1).equals(x.getInitial().substring(pos + 1)))
                    System.out.println(x.getName());
        }
    }
}