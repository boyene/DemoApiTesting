package ArraysPrograms;

import java.util.Arrays;

public class TestDemo7 {
     static public void main(String args[]) {
        int[] arr = {4, 2, 4, 3, 4, 2, 1, 3};

        // Variables to track the most frequent number
        int mostFrequent = arr[0];
        int maxCount = 1;

        // First pass: find the most frequent number
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int currentCount = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == current) {
                    currentCount++;
                }
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostFrequent = current;
            }
        }

        // Second pass: find all indexes of the most frequent number
        System.out.println("Most frequent number: " + mostFrequent);
        System.out.print("Indexes: ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mostFrequent) {
                System.out.print(i + " ");
            }
        }
    }
}
