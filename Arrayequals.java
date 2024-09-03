package arrayfunctions;
import java.util.Arrays;

public class Arrayequals {
    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4};

        // Check if arrays are equal
        boolean isEqual1 = Arrays.equals(array1, array2);
        boolean isEqual2 = Arrays.equals(array1, array3);

        // Print results
        System.out.println("Array1 and Array2 are equal: " + isEqual1);
        System.out.println("Array1 and Array3 are equal: " + isEqual2);
    }
}

