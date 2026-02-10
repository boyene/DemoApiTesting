package Streams;

import java.util.List;

public class ConvertListOfStringToUppercase {
    public static void main(String[] args) {
        List<String > names=List.of("Krishna","Yella","Madhan");
        List<String> n=names.stream().map(String::toUpperCase).toList();
        System.out.println(n+" ");

        List<String> sortingnames=List.of("Krishna","Yella","Madhan");
        sortingnames.stream().filter(k->k.startsWith("K")).sorted().forEach(k->System.out.println(k));

        List<String> names1=List.of("Krishna","Yella","Madhan");
        names1.stream().forEach(k->System.out.println(k));


    }
}
