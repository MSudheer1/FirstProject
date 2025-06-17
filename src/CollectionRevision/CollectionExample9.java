package CollectionRevision;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample9 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        ArrayList<String> uniqueList = new ArrayList<>();
        l.add("manoj");
        l.add("varun");
        l.add("yaswanth");
        l.add("sudheer");
        l.add("sudheer");
        l.add(null);
        for(String s:l){
            if(!uniqueList.contains(s)){
                uniqueList.add(s);
            }
        }
        System.out.println(uniqueList);

    }
}
