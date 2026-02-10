package ExceptionHandling;

import java.util.Scanner;

public class TestUnCheckedExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("Hello, main method started.");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter A Value:");
            int a = sc.nextInt();
            System.out.println("Enter B Value:");
            int b = sc.nextInt();

            // Attempt to divide a by b
            System.out.println("Result of a / b: " + (a / b));

        } catch (ArithmeticException e) {
            // Handle division by zero or other arithmetic exceptions
            System.out.println("An arithmetic error occurred: " + e.toString());
            System.out.println("Please ensure that B is not zero.");

        } finally {
            // Close the Scanner object to prevent resource leak
            sc.close();
        }

        System.out.println("Good Afternoon");
        System.out.println("Good Evening");
        System.out.println("Good Morning");
        System.out.println("Good Night");
    }


}