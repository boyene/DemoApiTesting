package ArraysPrograms;

public class LatElementSum {
    public static void main(String[] args) {
        int[] arr = {7,1, 2, 3, 4, 5,6};
        int sum = arr[0] + arr[arr.length - 1];
        System.out.println("Sum of first and last element: " + sum);
    }
}
