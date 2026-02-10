package ExceptionHandling;

import java.util.Scanner;

public class TestTryCatchFinallyDemo {
    public static void main(String [] args){

        System.out.println("Hello main method !!");
        try{
            System.out.println("in try !!");
            /*
            //Note 1:  if we have a problem in the try block directly next execution is jumping to catch block,
             even though we have some code in try block will never executes
             */
            System.out.println(10 / 0);

        }
        //Note 4 : We should not have any statements in between try, catch and finally
        // Error : 'catch' without 'try'
        //System.out.println("Finally Block");
        catch (ArithmeticException e){
           /* System.out.println(10 / 0);*/
            System.out.println("in catch");
           System.out.println(e.getMessage());

        }
        //Error called try without finally
        //System.out.println("Finally Block");
        finally {
            System.out.println("Finally Block");

        }

        System.out.println("Hello Yellakrishna !!");
        System.out.println("Hello Rohith !!");
        System.out.println("Hello WillYoung !!");
        System.out.println("Hello GlenPhillips!!");
    }
}
