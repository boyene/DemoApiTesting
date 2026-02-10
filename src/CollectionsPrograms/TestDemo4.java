package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.*;

public class TestDemo4 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Set.of(1, 2, 3,34));
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
//            if (itr.next() == 2) {
//                itr.remove();
//            }

        }
        System.out.println(set);


    }
}
