package ArraysPrograms;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
       int  [] arr = new int[5];
        arr[0] = arr[1] = arr[2] = arr[3] = arr[4] = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]++;
        }
        System.out.println("Array Output: " + Arrays.toString(arr));

    }
}
