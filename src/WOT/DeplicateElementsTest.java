package WOT;

import java.util.Arrays;
import java.util.HashSet;

public class DeplicateElementsTest {
    static void main() {
        int[] arr={1,2,2,3,2,2,4,5,2,2,6,5,5,};
        HashSet<Integer> h=new HashSet<>();
        for(int n:arr){
            h.add(n);
        }
        System.out.println(h);
//        HashSet<Integer> seen=new HashSet<>();
//        HashSet<Integer> duplicate=new HashSet<>();
//
//        for(int n:arr){
//            if(!seen.add(n)){
//                duplicate.add(n);
//            }
//        }
//        for(int n:duplicate){
//            System.out.println(n+" ");
//        }
    }
}
