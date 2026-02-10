package Logical;

public class NthPrimeNumberFinder {

    public static void main(String[] args) {
        int n = 2; // Change this to get the nth prime
        int count = 0;
        int number = 1;

        while (count < n) {
            number++;
            int factors = 0;

            // Count how many numbers divide 'number'
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    factors++;
                }
            }
            // A prime number has exactly 2 factors: 1 and itself
            if (factors == 2) {
                count++;
            }
        }

        System.out.println("The " + n + "th prime number is: " + number);
    }
}
