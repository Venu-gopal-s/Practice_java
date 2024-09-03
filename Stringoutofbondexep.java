package exception;
public class Stringoutofbondexep {
    public static void main(String[] args) {
        // Example string
        String text = "Hello, World!";

        // Try to access characters at different indices
        try {
            // Access character at a valid index
            char validChar = text.charAt(5);
            System.out.println("Character at index 5: " + validChar);

            // Try to access a character at an invalid index
            char invalidChar = text.charAt(20);
            System.out.println("Character at index 20: " + invalidChar);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds for the string.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

