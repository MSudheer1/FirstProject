package Java;

import java.util.HashSet;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        HashSet<Integer> al = new HashSet<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(30);
        al.add(20);
        al.add(10);
        System.out.println(al);
    }
}
