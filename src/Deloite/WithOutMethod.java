package Deloite;

import java.util.HashSet;

public class WithOutMethod {
    public static void main(String[] args) {
        int[] arr = {5, 8, 10, 12, 15,15,15,15,15,5,5,5};
        int num=13;
        int difference=3;

        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
           int dff= arr[i]>num?arr[i]-num:num-arr[i];
            if(dff<=difference){
                set.add(arr[i]);
            }
        }
        if(set.size()==0){
            System.out.println(-1);
        }else {
            System.out.println(set.size());
        }


    }
}
