package Patterns;

public class PatternDemo04 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
           for (int j = 2; j <= i; j++) {
               System.out.print(i+" ");
           }
            System.out.println();
        }
    }
}
