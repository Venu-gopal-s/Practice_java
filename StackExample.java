package assignements;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack and adding elements
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // 1. Iterating using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 2. Iterating using ListIterator (Forward and Backward)
        System.out.println("\nUsing ListIterator (Forward):");
        ListIterator<String> listIterator = stack.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nUsing ListIterator (Backward):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // 3. Using Stack-specific methods (LIFO order)
        System.out.println("\nUsing pop() method (LIFO order):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}



