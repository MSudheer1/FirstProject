package CollectionRevision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample13 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("manoj");
        l.add("varun");
        l.add("yaswanth");
        l.add("sudheer");
        l.add(null);
        List<String> s =Collections.unmodifiableList(l);
        s.add("Hii");
        System.out.println(s);

    }
}
