package assignements;

import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector and adding elements
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // 1. Iterating using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 2. Iterating using ListIterator
        System.out.println("\nUsing ListIterator (Forward):");
        ListIterator<String> listIterator = vector.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

}}