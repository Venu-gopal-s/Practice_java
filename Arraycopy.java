package arrayfunctions;
import java.util.Arrays;

public class Arraycopy {
    public static void main(String[] args) {
        // Define the source array
        int[] sourceArray = {10, 20, 30, 40, 50};

        // Copy values from sourceArray to destinationArray
        int[] destinationArray = Arrays.copyOf(sourceArray, sourceArray.length);

        // Print the destination array
        System.out.println("Destination Array:");
        for (int value : destinationArray) {
            System.out.println(value);
        }
    }
}

