package Streams;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    static void main() {
        List<Integer> list = new ArrayList<>(List.of(1, 6,2, 3,6,5 ,4, 2,5));
        list.stream().distinct().forEach(System.out::println);
    }
}
