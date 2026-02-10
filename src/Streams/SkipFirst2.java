package Streams;

import java.util.List;

public class SkipFirst2 {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(0,1,2,3,4,5,6,7,8,9,10,11,12,13);
        List<Integer> n=numbers.stream().skip(6).toList();
        System.out.println(n);
    }
}
