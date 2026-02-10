package Logical;


/*
    Prime numbers up to 100 are:
    2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
 */
public class TestDemoPrimeNumbers {
    public static void main(String[] args){
        int limit = 100;
        System.out.println("Prime numbers up to " + limit + " are:");

        for (int num = 2; num <= limit; num++) {
            int primeCount = 0;

            for (int div = 1; div <= num; div++) {
                if (num % div == 0) {
                    primeCount++;
                }
            }

            if (primeCount == 2) { // A prime number has exactly 2 factors (1 and itself)
                System.out.print(num + " ");
            }
        }
    }
}
