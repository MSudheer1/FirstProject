package CollectionRevision;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample7 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("manoj");
        l.add("varun");
        l.add("yaswanth");
        l.add("sudheer");
        l.add(null);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
