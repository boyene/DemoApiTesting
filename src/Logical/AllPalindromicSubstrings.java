package Logical;
public class AllPalindromicSubstrings {
    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    // Method to find and print all palindromic substrings of length >= 2
    public static void printAllPalindromes(String input) {
        int n = input.length();

        System.out.print("Output: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j <= n; j++) {
                String substring = input.substring(i, j);
                if (isPalindrome(substring)) {
                    System.out.print(substring + " ");
                }
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        String input1 = "madam";
        System.out.println("Input: " + input1);
        printAllPalindromes(input1);

        System.out.println();

        String input2 = "malayalam";
        System.out.println("Input: " + input2);
        printAllPalindromes(input2);
    }
}

