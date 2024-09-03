package arrayfunctions;
public class Reversestring {
    public static void main(String[] args) {
        // Define the original array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original Array:");
        printArray(originalArray);

        // Reverse the array
        reverseArray(originalArray);

        // Print the reversed array
        System.out.println("Reversed Array:");
        printArray(originalArray);
    }

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

