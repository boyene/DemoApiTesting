package NumberProgramsDemo;

public class TestPalindromeNumDemo10 {
    public static void main(String[] args){
        int i=141;
        int original=i;
        int q = 0;

        while (i != 0) {
            int r = i % 10; // Get the last digit
            i = i/10;   // Remove the last digit
            q = q*10 + r;  // Build the reversed number

        }
        System.out.println("Reversed number: " + q);
        if(original==q){
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
