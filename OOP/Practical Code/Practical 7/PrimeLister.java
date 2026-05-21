import java.util.Scanner;

public class PrimeLister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter an integer to list all prime numbers up to: ");
        int max = scanner.nextInt();

        System.out.println("\nPrime numbers up to " + max + ":");
        for (int num = 2; num <= max; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }

    // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}