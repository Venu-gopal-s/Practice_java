package assignements;

import java.util.ArrayList;

public class Listitrator {
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("A");
	        list.add("B");
	        list.add("C");

	        java.util.Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.println(element);
	            if (element.equals("B")) {
	                iterator.remove(); // Safe removal
	            }
	        }

	        System.out.println("List after removal: " + list);
	    }

}

