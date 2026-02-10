package ExceptionHandling;

import java.util.Stack;

public class TestUnCheckedExceptionDemo4 {
    static String name="krishna";
    public  static void main(String[] args){
        TestUnCheckedExceptionDemo4 t=new TestUnCheckedExceptionDemo4();
        TestUnCheckedExceptionDemo4 t1=null;
        System.out.println(t1);
        System.out.println(name.length());
        String s="Java";
        String s1="Yellakrishna";
        System.out.println(s.length());
        System.out.println(s1.length());
        System.out.println(s.toLowerCase());
        System.out.println(s1.toUpperCase());
        String s3=null;
        String s4=null;
        //NullPointerException
    /*    if(s3.equals(s4)){
            System.out.println("Both contents are equal !!");
        } else {
            System.out.println("Both contents are not equal !!");
        }
        */

        try {
            String s2=null;
            System.out.println(s2.length());
        }catch (NullPointerException n){
            System.out.println(n.getMessage());
        }

        System.out.println("Hello Good Morning");
    }
}
