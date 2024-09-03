package arrayfunctions;
import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Create an array of Double with the specified size
        Double[] doubleArray = new Double[size];

        // Prompt the user to enter values for the array
        System.out.println("Enter " + size + " double values:");

        // Read and store each value in the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for index " + i + ": ");
            doubleArray[i] = scanner.nextDouble();
        }

        // Print the array values
        System.out.println("Array values are:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println("Index " + i + ": " + doubleArray[i]);
        }

        // Close the scanner
        scanner.close();
    }
}

