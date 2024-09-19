package assignements;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue and adding elements
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(50);
        priorityQueue.add(10);

        // 1. Iterating using Iterator
        System.out.println("Using Iterator:");
        Iterator<Integer> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 2. Checking the priority of elements using poll
        System.out.println("\nUsing poll to retrieve elements based on priority:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());  // Retrieves in priority order
        }
    }
}
