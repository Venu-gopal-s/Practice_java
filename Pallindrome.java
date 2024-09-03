package stringfunctions;
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Check if the string is a palindrome
        if (isPalindrome(original)) {
            System.out.println("The string \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lower case to handle case insensitivity
        str = str.toLowerCase();

        // Get the length of the string
        int length = str.length();

        // Compare characters from the beginning and the end
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false; // If any characters don't match, it's not a palindrome
            }
        }

        return true; // If all characters match, it's a palindrome
    }
}

