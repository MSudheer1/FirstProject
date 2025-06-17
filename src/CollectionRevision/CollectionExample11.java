package CollectionRevision;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample11 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("manoj");
        l.add("varun");
        l.add("yaswanth");
        l.add("sudheer");
        l.add(null);
        ArrayList<String> al = new ArrayList<>();
        al.add("manoj");
        al.add("sudheer");
        al.add(null);
        l.removeAll(al);
        System.out.println(l);
        System.out.println(al);
    }
}
