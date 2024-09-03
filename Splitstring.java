package stringfunctions;

//import java.util.Iterator;

public class Splitstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = " manish kumar tiwari";
		//name.split("  ");
		String[] parts = name.split(" ");
		for(String part : parts )
		{
			System.out.println(part);
		}
	}

}
