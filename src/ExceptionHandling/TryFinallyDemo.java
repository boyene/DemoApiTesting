package ExceptionHandling;

import java.util.Scanner;

public class TryFinallyDemo {
    public static void main(String[] args) {

//without catch block there is no chance of next line code execute

        try{
            System.out.println("try block");
            System.out.println(10/0);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {

            System.out.println("Finally block");
           // System.exit(0);
        }
        System.out.println("hello");
        System.out.println("Hi Ra yellakrishna");

    }
}
