package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Variable to store the size of the array
        int size = 0;
        int[] numbers = null;

        // Handle InputMismatchException when getting the array size
        try {
            // Prompt the user to enter the size of the array
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();

            // Initialize the array with the given size
            numbers = new int[size];

            // Attempt to enter values into the array
            System.out.println("Enter " + size + " integer values:");

            // Loop to get array values
            for (int i = 0; i < size; i++) {
                try {
                    System.out.print("Enter value for index " + i + ": ");
                    numbers[i] = scanner.nextInt(); // Handle InputMismatchException
                } catch (InputMismatchException e) {
                    System.out.println("Error: Please enter a valid integer.");
                    scanner.next(); // Clear the invalid input
                    i--; // Decrement index to re-enter value
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer for the array size.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        // Print the array contents if no exception occurred
        if (numbers != null) {
            System.out.println("Array contents:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Index " + i + ": " + numbers[i]);
            }
        }

        // Close the scanner
        scanner.close();
    }
}

