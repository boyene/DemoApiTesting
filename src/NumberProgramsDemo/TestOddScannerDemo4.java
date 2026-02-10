package NumberProgramsDemo;

import java.util.Scanner;

public class TestOddScannerDemo4 {

    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Starting Value: ");
        int a=sc.nextInt();
        System.out.println("Enter Ending Value: ");
        int b=sc.nextInt();
        System.out.println("List Of The Odd Numbers are: ");
        for(int c=a;c<=b;c++){
            if(c%2==1){
                System.out.println(c+" ");
            }
        }
    }
}
