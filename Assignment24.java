package assignments;

import java.util.Scanner;

public class Assignment24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner a1 = new Scanner(System.in);
       System.out.println(" enter value a");
       int a = a1.nextInt();
       System.out.println(" enter value b");
         double b = a1.nextInt();
         System.out.println(" enter value h");
         double h = a1.nextInt();
       
      
   double circumtrap = (0.5)*(a+b)*h;
       System.out.println(circumtrap);
       
       
	}

}
