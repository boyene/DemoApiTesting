package Logical;

public class EvenOddTestDemo1 {
    public static  void main(String[] args){
        System.out.println("Even Numbers: ");
        for(int a=1;a<=10;a++){
            if(a%2==0) {
                System.out.print(a+" ");
            }
        }


        System.out.println();

        System.out.println("Odd Numbers: ");
        for(int a=1;a<=10;a++){
            if(a%2==1) {
                System.out.print(a+" ");
            }
        }
    }
}
