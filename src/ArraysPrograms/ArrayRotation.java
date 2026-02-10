package ArraysPrograms;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 4; // Number of positions to rotate

        int[] rotatedArr = rotateLeft(arr, k);

        System.out.println("Array after rotating left by " + k + " positions: ");
        System.out.print("{ ");
        for (int num : rotatedArr) {
            System.out.print(num+" ");
        }
        System.out.println("}");
    }

    public static int[] rotateLeft(int[] array, int k) {
        int n = array.length;
        int[] result = new int[n];

        // Adjust k if it's greater than array length
        k = k % n;

        // Copy elements from k to end
        for (int i = 0; i < n - k; i++) {
            result[i] = array[i + k];
        }

        // Copy first k elements to the end
        for (int i = n - k; i < n; i++) {
            result[i] = array[i - (n - k)];
        }

        return result;
    }
}
