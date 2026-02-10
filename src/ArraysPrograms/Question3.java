package ArraysPrograms;

public class Question3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        int[] b = a;
        b[0] = 5;
        System.out.println("Output: " + (a[0] + b[0]));
    }
}
