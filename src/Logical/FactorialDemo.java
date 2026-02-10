package Logical;

public class FactorialDemo {
    public static void main(String[] args) {
        int n=5;
        long result=1;
        for (int a=1;a<=n;a++){
            result = result*a;
        }
        System.out.print("Factorial of "+n+" is : "+result+" ");
    }
}
