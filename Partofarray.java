package arrayfunctions;
import java.util.Scanner;

public class Partofarray {
    public static void main(String[] args) {
        // Define the array of int values
        int[] numbers = {100, 200, 300, 400};

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number to check
        System.out.print("Enter a number to check: ");
        int inputNumber = scanner.nextInt();

        // Check if the number is part of the array
        boolean isFound = false;
        for (int number : numbers) {
            if (number == inputNumber) {
                isFound = true;
                break;
            }
        }

        // Print the result
        if (isFound) {
            System.out.println("The number " + inputNumber + " is part of the array.");
        } else {
            System.out.println("The number " + inputNumber + " is not part of the array.");
        }

        // Close the scanner
        scanner.close();
    }
}
