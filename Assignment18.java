package assignments;

import java.util.Scanner;

public class Assignment18 {

	public static void main(String[] args) {
		Scanner A1 = new Scanner(System.in);
		System.out.println(" enter  a number ");
		int number = A1.nextInt();
		if (number  % 2 == 0) {
			System.out.println(" number is even ");	
		} else {

			System.out.println(" number is odd ");
		}

	}

}
