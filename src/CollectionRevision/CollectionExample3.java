package CollectionRevision;

import java.util.ArrayList;

public class CollectionExample3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("manoj");
        al.add("varun");
        al.add("yaswanth");
        al.add("sudheer");
        al.add(null);
        al.remove(2);
        System.out.println(al);
    }
}
