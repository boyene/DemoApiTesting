package CoreJava;


import java.util.ArrayList;
import java.util.List;

public class TestDemo1 {
    public static void main(String[] args){
       /* Cat c=new Cat();
        System.out.println(c.sound());
        System.out.println(c.Walking());*/

        Animall c=new Cat();
        System.out.println(c.sound());
        System.out.println(c.Walking());

        c.method();
        c.method1();
        c.method2();
        c.hunting();



    }
}
