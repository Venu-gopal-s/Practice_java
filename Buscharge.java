package assignments;

import java.util.Scanner;

public class Buscharge {

	public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("please enter your  gender(male/female) ");
            String gender = s1.next().toLowerCase();
           System.out.println("enter your age");
           int age = s1.nextInt();
           
          if(gender.equals("female"))
          {
        	  System.out.println("Travelling is free");
          }
          else if (gender.equals("male")) {
        	  if(age<=12)
        	  {
        		  System.out.println("half ticket ");
        	  }
        	  else if (age > 12 && age<=59) {
        		  
        		  System.out.println("full ticket");
				
			}
        	  else {
        		  System.out.println(" senior citizen ticket ");
        	  }
        	 // else {
        		  System.out.println("invalid ticket ");
        	  
        	  }
			
		}


	}





