package assignements;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet and adding elements
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);

        // 1. Iterating using Iterator (will follow sorted order)
        System.out.println("Using Iterator:");
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 2. Using higher-level methods of TreeSet to demonstrate sorted behavior
        System.out.println("\nFirst element (smallest): " + treeSet.first());
        System.out.println("Last element (largest): " + treeSet.last());
    }
}

