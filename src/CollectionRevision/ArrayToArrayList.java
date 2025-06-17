package CollectionRevision;

import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] a ={"B","C","A"};
        ArrayList<String> al = new ArrayList<>();
        for(String temp:a){
            al.add(temp);
        }
        System.out.println(al);
    }
}
