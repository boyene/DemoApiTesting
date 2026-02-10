package Logical;

public class PrimeFactors {
    public static void main(String[] args) {
        int fcount=0;
        int i=10;
        System.out.println("Factors of "+i+" is ");
        for (int a=1;a<=i;a++){
            if (i%a==0){
                fcount++;
                System.out.print(a+" ");
            }

        }
        System.out.println();
        System.out.println(i+" Factor Count is : "+fcount);
        if (fcount<3){
            System.out.println(i+" Is a prime Number");
        }else {
            System.out.println(i+" Is Not a prime Number");

        }
    }
}
