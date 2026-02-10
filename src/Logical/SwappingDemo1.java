package Logical;

public class SwappingDemo1 {
    public static void main(String[] args) {
        // Initial values
        int a = 10;
        int b = 20;

        // Print before swapping
        System.out.println("before Swapping a : " + a + " b : " + b);
        // Swapping logic without temporary variable
        int c = a + b;  // c becomes 30 (10 + 20)
        a = c - a;       // a becomes 20 (30 - 10)
        b = c - b;       // b becomes 10 (30 - 20)

        // Print after swapping
        System.out.println("after  Swapping a : " + a + " b : " + b);
    }
}
