package Streams;

import java.util.List;

public class NameStartingWith {
    public static void main(String[] args) {
        List<String> names=List.of("Madhan","subhan","krishna");
       List<String> l= names.stream().filter(k->k.startsWith("k")).toList();
        System.out.println(l+" ");
    }
}
