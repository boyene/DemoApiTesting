package WOT;

import java.util.HashSet;

public class TargetValue {
    static void main() {
        int[] arr={2,3,4,2,1,5,8,7,1,5,4};
        int target=5;
        HashSet<String> n=new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i]+arr[j]==target){
                   String s=("("+arr[i]+" , "+arr[j]+")");
                   n.add(s);
                }
            }
        }
        for(String i:n){
            System.out.println(i+" ");
        }
    }
}
