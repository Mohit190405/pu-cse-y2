import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect employee information
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        // Display the details
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID        : " + empId);
        System.out.println("Name      : " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary    : ₹" + salary);

        scanner.close();
    }
}