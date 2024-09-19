package assignements;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Getting an iterator
        Iterator<String> iterator = set.iterator();

        // Iterating over the HashSet using the iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Alternatively, you can use a foreach loop
        for (String element : set) {
            System.out.println(element);
        }
    }
}

