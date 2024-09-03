package arrayfunctions;
import java.util.Scanner;

public class Average_array {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Define the size of the array
        int size = 4;
        int[] numbers = new int[size];

        // Prompt the user to enter values for the array
        System.out.println("Enter " + size + " integer values:");

        // Read and store each value in the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the average
        double average = calculateAverage(numbers);

        // Print the average
        System.out.println("The average of the array is: " + average);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the average of an array
    public static double calculateAverage(int[] array) {
        int sum = 0;

        // Calculate the sum of the elements
        for (int value : array) {
            sum += value;
        }

        // Return the average
        return (double) sum / array.length;
    }
}
