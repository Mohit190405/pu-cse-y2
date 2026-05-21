public class Operations {
    public static void main(String[] args) {
        // Initial values
        int a = 12;
        int b = 5;

        // Arithmetic operations
        System.out.println("Arithmetic Operations:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Bitwise operations
        System.out.println("\nBitwise Operations:");
        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("Left Shift a<<1: " + (a << 1));
        System.out.println("Right Shift a>>1: " + (a >> 1));
        System.out.println("Complement ~a: " + (~a));
    }
}