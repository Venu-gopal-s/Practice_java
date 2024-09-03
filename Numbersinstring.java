package stringfunctions;
import java.util.Scanner;

public class Numbersinstring {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Variables to store the counts
        int alphabets = 0, numbers = 0, spaces = 0, others = 0;

        // Iterate over each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                alphabets++;
            }
            // Check if the character is a digit
            else if (Character.isDigit(ch)) {
                numbers++;
            }
            // Check if the character is a space
            else if (ch == ' ') {
                spaces++;
            }
            // Count any other characters
            else {
                others++;
            }
        }

        // Display the counts
        System.out.println("Number of Alphabets: " + alphabets);
        System.out.println("Number of Numbers: " + numbers);
        System.out.println("Number of Spaces: " + spaces);
        System.out.println("Number of Other Characters: " + others);

        // Close the scanner
        scanner.close();
    }
}

