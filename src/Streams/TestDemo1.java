package Streams;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestDemo1 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>(Arrays.asList(0,1,2,3,4,6,5));
        List<Integer> n= numbers.stream().filter(k->k%2==0).collect(Collectors.toList());
        System.out.println(n+" ");

        int[] array={1,2,3,4,5,6,0};
        List<Integer> e= Arrays.stream(array).filter(i->i%2==1).boxed().collect(Collectors.toList());
        System.out.println(e);

       List<Integer> a= Arrays.stream(array).map(j->(j*2)).boxed().collect(Collectors.toList());
        System.out.println(a+" ");

    }

}
