package NumberProgramsDemo;

import java.util.Scanner;

public class TestSwappingScannerDemo6 {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Value : ");
        int a=sc.nextInt();
        System.out.println("Enter Second Value : ");
        int b=sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int c=a+b;
        a=c-a;
        b=c-b;
        System.out.println("After swapping: a = " + a + ", b = " + b);



    }
}
