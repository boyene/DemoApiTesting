package WOT;


public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 7,9};

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        boolean[] present = new boolean[max + 1];

        for (int num : arr) {
            present[num] = true;
        }

        System.out.print("Missing Numbers: ");
        for (int i = 1; i <= max; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

