package AccessModifiers2;

import AccessModifiers.TestDemo11;


public class TestDemo3 {
    public static void main(String [] args){
        /*
        TestDemo11 is a Default class , we cannot access  outside the package
        but if your Class Public then we can Create Object
         */
        TestDemo11 t=new TestDemo11();
        System.out.println();
        /*System.out.println(t.age);
        System.out.println(t.email);
        t.mathod2();*/

        System.out.println(t.Room);
        System.out.println(t.Address);
        t.method3();


        /*System.out.println(t.b);
        System.out.println(t.salary);
        t.method4();*/

    }
}
