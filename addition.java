import java.lang.*;
import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Sum the two integers
        int sum = num1 + num2;

        // Print the result
        System.out.println("The sum of the two integers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
