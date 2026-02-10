package exam;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {

    // Method 1: double + String
    public String rate(double localCurrency, String foreignCurrency) {
        return (int)localCurrency + foreignCurrency;
    }

    // Method 2: double + double
    public String rate(double localCurrency, double foreignCurrency) {
        double sum = localCurrency + foreignCurrency;

        // Round to 2 decimal places using BigDecimal with HALF_UP
        BigDecimal bd = new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP);

        // Convert back to double to remove unnecessary trailing zeros
        double roundedValue = bd.doubleValue();

        return String.valueOf(roundedValue);
    }

    // Method 3: String + String
    public String rate(String localCurrency, String foreignCurrency) {
        return localCurrency + foreignCurrency;
    }

    // Main method for quick testing
    public static void main(String[] args) {
        Solution ex = new Solution();

        System.out.println(ex.rate(1, "Euro"));        // 1Euro
        System.out.println(ex.rate("dollars", "yen")); // dollarsyen
        System.out.println(ex.rate(5, 7));             // 12.0
        System.out.println(ex.rate(2, 2));             // 4.0
        System.out.println(ex.rate(3.765, 0));         // 3.77
        System.out.println(ex.rate(3.7649, 0));        // 3.76
        System.out.println(ex.rate(3.778, 0));         // 3.79
    }
}
