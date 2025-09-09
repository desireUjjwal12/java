public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;

        //  Basic arithmetic operations
        int addition = a + b;        // Addition
        int subtraction = a - b;     // Subtraction
        int multiplication = a * b;  // Multiplication
        int division = a / b;        // Division (integer division)
        int modulus = a % b;         // Modulus (remainder)

        //  Increment and Decrement
        int preIncrement = ++a;   // First increment, then use
        int postIncrement = b++;  // First use, then increment
        int preDecrement = --a;   // First decrement, then use
        int postDecrement = b--;  // First use, then decrement

        System.out.println("a + b = " + addition);
        System.out.println("a - b = " + subtraction);
        System.out.println("a * b = " + multiplication);
        System.out.println("a / b = " + division);
        System.out.println("a % b = " + modulus);

        System.out.println("Pre-Increment of a: " + preIncrement);
        System.out.println("Post-Increment of b: " + postIncrement);
        System.out.println("Pre-Decrement of a: " + preDecrement);
        System.out.println("Post-Decrement of b: " + postDecrement);
    }
}
