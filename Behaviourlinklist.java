package assignements;
import java.util.LinkedList;
import java.util.ListIterator;
public class Behaviourlinklist {	

	        LinkedList<String> list = new LinkedList<>();
	     

	        ListIterator<String> listIterator = list.listIterator();{
	        	
	        while (listIterator.hasNext()) {
	            String element = listIterator.next();
	            System.out.println(element);
	            if (element.equals("B")) {
	                listIterator.set("D"); // Replace B with D
	            }
	        }

	        System.out.println("List after modification: " + list);
	    }
	}


