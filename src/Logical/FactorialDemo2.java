package Logical;

public class FactorialDemo2 {

    public static int factorial(int a){
        int b=1;
        for (int c=1;c<=a;c++){
           b= b*c;
        }
        return b;
    }

    public static void main(String[] args) {
        int a=6;
        System.out.println("factorial of "+a+" is "+factorial(a));
    }
}
