package CollectionsPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairOfNumbersTarget {
    static void main() {
        int[] arr={1,2,2,3,4,3};
         int target=6;
        Map<Integer,Integer> map=new HashMap<>();
        Set<String> pairs=new HashSet<>();
        for(int num:arr){
           int k=target-num;
           if(map.containsKey(k)){
               int a,b;
               if(num<k){
                   a=num;
                   b=k;
               }else {
                   a=k;
                   b=num;
               }
               pairs.add("("+a+","+b+")");
           }
           map.put(num,null);
        }
        System.out.println("Pairs with given targer : "+target+" : "+pairs);
    }
}
