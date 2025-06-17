package CollectionRevision;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample4 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("manoj");
        l.add("varun");
        l.add("yaswanth");
        l.add("sudheer");
        l.add(null);
        l.clear();
        System.out.println(l);
    }
}
