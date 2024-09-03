package assignments;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a1 = new Scanner(System.in);
		// area of circle pir
		System.out.println(" enter value of pi ");
		double pi=a1.nextDouble();
		System.out.println(" enter value of r");
		int r = a1.nextInt();
		double Area = pi * r;
		System.out.println(Area);
		

	}

}
