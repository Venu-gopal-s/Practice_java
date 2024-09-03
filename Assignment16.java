package assignments;

import java.util.Scanner;

public class Assignment16 {

	public static void main(String[] args) {
     Scanner s1 = new Scanner(System.in);
     System.out.println(" enter a value ");
     int a = s1.nextInt();
     System.out.println(" enter value b ");
     int b = s1.nextInt();
     int sum = a+b;
     int sub = a-b;
     int mul = a*b;
     int div = a/b;
     System.out.println("Sum of a+b is  " +sum);
     System.out.println("sub of a-b is  " +sub);
     System.out.println("mul of a*b is  " +mul);
     System.out.println("div of a/b is  " +div);
	}

}
