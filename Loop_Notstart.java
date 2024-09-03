package loops;
public class Loop_Notstart {
    public static void main(String[] args) {
        // For loop with an initial condition that is false
        for (int i = 0; i < 0; i++) {
            System.out.println("This line will not be printed.");
        }
        
        System.out.println("For loop didn't start.");
    }
}
