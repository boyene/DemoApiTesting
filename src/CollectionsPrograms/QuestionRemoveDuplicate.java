package CollectionsPrograms;

import java.util.HashMap;
import java.util.Map;

public class QuestionRemoveDuplicate {
    static void main() {
        int[] arr = {2,5,2,5,8,8,9,7,7,5,2,3,4,7};
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
      //  System.out.println("Element frequencies: " + map);
        for(Map.Entry<Integer,Integer> m:map.entrySet()) {

                System.out.print(m.getKey()+" ");

        }
    }
}
