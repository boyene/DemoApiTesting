package ExceptionHandling;

import java.util.Set;
import java.util.TreeSet;

/*ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String
        (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')*/

public class ClassCastException {
    public static void main(String[] args) {
        Set<Object> elements=new TreeSet<>();
        elements.add(10);
        elements.add(20);
        elements.add(30);
        elements.add("Krishna");
        elements.add('A');
        elements.add(12.00);
        System.out.println(elements);


    }
}
