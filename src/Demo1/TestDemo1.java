package Demo1;

import java.util.Scanner;

public class TestDemo1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        double totalDepositAmount = 0;
        int numberOfDeposits;

        System.out.print("Enter the number of deposits: ");
        numberOfDeposits = scanner.nextInt();

        // Use a for loop to process deposits
        for (int i = 1; i <= numberOfDeposits; i++) {
            System.out.print("Enter deposit amount " + i + ": ");
            double amount = scanner.nextDouble();
            totalDepositAmount += amount;
        }

        System.out.println("Total deposit amount:" + totalDepositAmount);
    }
}
