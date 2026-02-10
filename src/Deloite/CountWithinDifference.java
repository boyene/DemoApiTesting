package Deloite;

import java.util.HashSet;

public class CountWithinDifference {
    public static void main(String[] args) {
        int[] arr={5, 8, 10, 12, 15};
       int r= findCount(arr,arr.length,10,3);
        System.out.println(r);

    }
    public static int findCount(int arr[],int length,int num,int difference){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < length; i++) {
            int diff = arr[i] > num ? arr[i] - num : num - arr[i];

            if (diff <= difference) {
                set.add(arr[    i]);
            }
        }

        return set.size() == 0 ? -1 : set.size();
    }
}
