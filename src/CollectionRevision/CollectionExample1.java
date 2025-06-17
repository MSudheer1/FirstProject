package CollectionRevision;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample1 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("B");
        l.add("C");
        l.add(null);
        System.out.println(l);
    }
}
