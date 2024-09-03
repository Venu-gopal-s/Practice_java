package stringfunctions;
import java.util.Scanner;

public class Special_character {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Variable to store the count of special characters
        int specialCharCount = 0;

        // Iterate over each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is not a letter, digit, or space
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }

        // Display the count of special characters
        System.out.println("Number of Special Characters: " + specialCharCount);

        // Close the scanner
        scanner.close();
    }
}

