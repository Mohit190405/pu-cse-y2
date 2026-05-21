import java.util.Scanner;

public class FibonacciDual {
    
    // Recursive method
    static int recursiveFibonacci(int n) {
        if (n <= 2) return 1;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    // Non-recursive (iterative) method
    static int iterativeFibonacci(int n) {
        if (n <= 2) return 1;
        int prev = 1, curr = 1;
        for (int i = 3; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input position
        System.out.print("Enter the position n to find the nth Fibonacci number: ");
        int n = scanner.nextInt();

        // Results
        System.out.println("\nFibonacci number at position " + n + " (Recursive): " + recursiveFibonacci(n));
        System.out.println("Fibonacci number at position " + n + " (Iterative): " + iterativeFibonacci(n));

        scanner.close();
    }
}