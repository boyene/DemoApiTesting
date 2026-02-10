package Logical;

import java.util.Scanner;

public class PrimeNumbersUpToScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Range From : ");
        int i = scanner.nextInt();
        System.out.println("Enter Range To  : ");
        int j=scanner.nextInt();
        System.out.println("Prime Numbers Up to "+i+" To "+j);
        for (int a=i;a<=j;a++){
            int fcount=0;
            for (int b=1;b<=a;b++){
                if(a%b==0){
                    fcount++;
                }
            }

            if (fcount == 2) { // Prime numbers have exactly 2 factors: 1 and itself
                System.out.print(a + " ");
            }
        }


    }
}
