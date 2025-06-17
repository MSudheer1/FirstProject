package CollectionRevision;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample10 {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("manoj");
        l.add("varun");
        l.add("yaswanth");
        l.add("sudheer");
        l.add(null);
        ArrayList<String> al = new ArrayList<>();
        al.add("manoj");
        al.add("varun");
        al.add("yaswanth");
        al.add("sudheer");
        al.add(null);
        l.addAll(al);
        System.out.println(l);
        System.out.println(al);
    }
}
