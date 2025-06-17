package CollectionRevision;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample12 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("manoj");
        l.add("varun");
        l.add("yaswanth");
        l.add("sudheer");
        l.add(null);
        ArrayList<String> al = new ArrayList<>();
        al.add("manoj");
        l.retainAll(al);
        System.out.println(l);
        System.out.println(al);
    }
}
