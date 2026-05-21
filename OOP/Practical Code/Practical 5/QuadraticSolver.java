import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Compute the discriminant
        double discriminant = b * b - 4 * a * c;

        System.out.println("\nSolving equation: " + a + "x² + " + b + "x + " + c + " = 0");

        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real solutions:");
            System.out.println("x₁ = " + root1);
            System.out.println("x₂ = " + root2);
        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("One real solution:");
            System.out.println("x = " + root);
        } else {
            // No real roots
            System.out.println("No real solutions. The discriminant is negative.");
        }

        scanner.close();
    }
}