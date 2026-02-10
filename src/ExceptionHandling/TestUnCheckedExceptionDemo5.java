package ExceptionHandling;

import java.util.Scanner;

public class TestUnCheckedExceptionDemo5 {
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("You are eligible for Voting !!");
        } else {
            System.out.println("you are not eligible for voting !!");
        }
    }
}
