import java.util.Scanner;
import java.util.Arrays;
public class Practical9 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter number of names: ");
 int n = scanner.nextInt();
 String[] names = new String[n];
 System.out.println("Enter names:");
 for (int i = 0; i < n; i++) {
 names[i] = scanner.next();
 }
 Arrays.sort(names);
 System.out.println("Sorted names:");
 for (String name : names) {
 System.out.println(name);
 }
 scanner.close();
 }
}