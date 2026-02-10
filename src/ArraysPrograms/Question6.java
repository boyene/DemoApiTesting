package ArraysPrograms;

public class Question6 {

        public static void main(String[] args) {
            int[] arr = {2, 10, 30, 40, 20, 11, 42,35,4,4,4,4};

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

