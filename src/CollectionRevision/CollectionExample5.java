package CollectionRevision;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample5 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("manoj");
        l.add("varun");
        l.add("yaswanth");
        l.add("sudheer");
        l.add(null);
        l.add(0,"Madamanchi");
        System.out.println(l);
    }
}
