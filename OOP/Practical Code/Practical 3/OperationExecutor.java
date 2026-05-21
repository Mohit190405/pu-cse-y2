// Class for Arithmetic Operations
class ArithmeticOperations {
    int add(int a, int b) { return a + b; }
    int subtract(int a, int b) { return a - b; }
    int multiply(int a, int b) { return a * b; }
    int divide(int a, int b) { return a / b; }
    int modulus(int a, int b) { return a % b; }
}

// Class for Bitwise Operations
class BitwiseOperations {
    int and(int a, int b) { return a & b; }
    int or(int a, int b) { return a | b; }
    int xor(int a, int b) { return a ^ b; }
    int leftShift(int a, int shiftBy) { return a << shiftBy; }
    int rightShift(int a, int shiftBy) { return a >> shiftBy; }
    int complement(int a) { return ~a; }
}

// Main Class to Execute
public class OperationExecutor {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;

        ArithmeticOperations arith = new ArithmeticOperations();
        BitwiseOperations bit = new BitwiseOperations();

        System.out.println("Arithmetic Operations:");
        System.out.println("Add: " + arith.add(a, b));
        System.out.println("Subtract: " + arith.subtract(a, b));
        System.out.println("Multiply: " + arith.multiply(a, b));
        System.out.println("Divide: " + arith.divide(a, b));
        System.out.println("Modulus: " + arith.modulus(a, b));

        System.out.println("\nBitwise Operations:");
        System.out.println("AND: " + bit.and(a, b));
        System.out.println("OR: " + bit.or(a, b));
        System.out.println("XOR: " + bit.xor(a, b));
        System.out.println("Left Shift: " + bit.leftShift(a, 1));
        System.out.println("Right Shift: " + bit.rightShift(a, 1));
        System.out.println("Complement: " + bit.complement(a));
    }
}