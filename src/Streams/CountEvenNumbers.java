package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class CountEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
        //count Of Even
       Long EvenCount= numbers.stream().filter(k->k%2==0).count();
        System.out.println("Even Number Count  : "+EvenCount);
        //Count of Odd
        Long OddCount=numbers.stream().filter(k->k%2==1).count();
        System.out.println("Odd Numbers : "+OddCount);

        //To print even
        List<Integer> even= numbers.stream().filter(q->q%2==0).collect(Collectors.toList());
        System.out.println(even+" ");
        //To print Odd
        List<Integer> odd=numbers.stream().filter(a->a%2==1).collect(Collectors.toList());
        System.out.println(odd+" ");

    }
}
