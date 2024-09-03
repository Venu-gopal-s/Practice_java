package assignments;

public class Ififelse {

	public static void main(String[] args) {
		char Gender1= 'F';
		char Gender2= 'M';
		if (Gender1=='F') {
			System.out.println("Free ticket in bus ");
		}
		     else {
			         System.out.println("no free ticket");
		          }
		if (Gender2=='M') {
			
			System.out.println("Am male");
		}
			   if (Gender2>=12) {
				System.out.println("Half ticket price");
			} 
		else {
			
			if (Gender2>=12 && Gender2<=59) {
				
				System.out.println("full ticket");
				
			}
			//else {
				if (Gender2>=59) {
					System.out.println("Senior citizen ticket price ");
				}
			}

			}
			
		 }
	
