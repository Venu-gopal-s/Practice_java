package interface2;
import java.util.Arrays;
import java.util.Scanner;

public class Anagramstring {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the strings are anagrams
        boolean areAnagrams = areAnagrams(str1, str2);

        // Print the result
        if (areAnagrams) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove any spaces and convert to lowercase for comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort both char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

