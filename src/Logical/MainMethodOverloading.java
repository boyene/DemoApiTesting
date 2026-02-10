package Logical;

import java.util.SortedSet;

public class MainMethodOverloading {

    public static void main(String[] args) {
        System.out.println("main method");
        main(20);
        main("krishna",10000.00);
    }
    public static void main(int a) {
        System.out.println("overloaded main method with int :  "+a);
    }

    public static void main(String name,double sal) {
        System.out.println("overloaded main method with String  :  name: "+name+", salary: "+sal);
    }
}
