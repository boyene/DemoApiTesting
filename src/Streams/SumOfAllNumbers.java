package Streams;

import java.util.List;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> number=List.of(20,10);
        int sum = number.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
