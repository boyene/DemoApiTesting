package ArraysPrograms;

public class MissingElement {
    static void main() {
        int[] arr = {1, 2, 3,4, 5, 6};
        int n = arr.length;
        int total = (n+1)*(n + 2)/ 2;
        int sum=0;
        for (int num : arr) {
            sum += num;
        }
        int missing = total - sum;
        System.out.println("Missing element is: " + missing);
    }
}
