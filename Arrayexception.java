package exception;
import java.util.Scanner;

public class Arrayexception {
    public static void main(String[] args) {
        // Define the size of the array
        int size = 4;
        int[] numbers = new int[size];
        
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Attempt to enter five values into the array
        System.out.println("Enter " + (size + 1) + " integer values:");

        // Use a try-catch block to handle potential exceptions
        try {
            for (int i = 0; i < size + 1; i++) {
                System.out.print("Enter value for index " + i + ": ");
                // Try to assign the value to the array
                numbers[i] = scanner.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You tried to enter more values than the array can hold.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        // Print the array contents
        System.out.println("Array contents:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // Close the scanner
        scanner.close();
    }
}

