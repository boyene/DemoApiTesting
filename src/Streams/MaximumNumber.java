package Streams;

import java.util.List;

public class MaximumNumber {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,5,8,7,6);
        int max=  numbers.stream().max(Integer::compareTo).orElseThrow();
        System.out.println("Maximum Number : "+max);

        int min=numbers.stream().min(Integer::compareTo).orElseThrow(()->new RuntimeException());
        System.out.println("Minimum Number : "+min);


    }
}
