package CollectionsPrograms;

import java.util.HashSet;
import java.util.Set;

public class TargetValue {
    static void main() {
        int[] arr={1,2,2,3,4,4,1};
        int target=5;
        Set<String> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    String s=("("+arr[i]+","+arr[j]+")");
                    set.add(s);
                }
            }
        }
        for (String s:set){
            System.out.println(s);
        }
    }
}
