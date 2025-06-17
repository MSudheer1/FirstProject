package CollectionRevision;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample14 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("manoj");
        l.add("varun");
        l.add("yaswanth");
        l.add("sudheer");
        l.add(null);
        Object[] obj = l.toArray();
        for(Object temp:obj){
            System.out.println(temp);
        }
    }
}
