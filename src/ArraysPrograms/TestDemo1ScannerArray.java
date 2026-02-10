package ArraysPrograms;

import java.util.Scanner;

public class TestDemo1ScannerArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array : ");

        int number=sc.nextInt();
        int[] num=new int[number];
        System.out.println("Enter Elements: ");
        for(int a=0;a<num.length;a++){
            num[a]=sc.nextInt();
        }
        System.out.println("Prime Numbers condition");

        for(int a=0;a<number;a++){
            /*if(a%2==1){
                System.out.println(a);
            }*/
            boolean isPrime=true;
            for(int b=2;b<num[a];b++){
                if(num[a]%b==0){
                    isPrime=false;
                    break;
                }

            }
            if(isPrime){
                System.out.println(num[a]);
            }
        }
    }
}
