package Streams;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,4,2,1);
        Set<Integer> seen=new HashSet<>();

        List<Integer>  dup=numbers.stream().filter(w->!seen.add(w)).toList();
        System.out.println(dup);

        List<Integer> number= new LinkedList<>(Set.of(2,20,3,30,300));
      Set<Integer> n  =number.stream().collect(Collectors.toSet());
        System.out.println(n);
    }
}
