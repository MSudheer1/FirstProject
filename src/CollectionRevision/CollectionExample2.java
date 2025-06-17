package CollectionRevision;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("B");
        al.add("C");
        al.add(null);
        System.out.println(al.get(2));
        System.out.println(al.get(sc.nextInt()));
    }
}
