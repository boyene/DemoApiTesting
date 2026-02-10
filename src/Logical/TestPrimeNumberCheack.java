package Logical;

/*
            Factors are : 1,2
            Total Factor Count is -> 2
            Then 2 is a  PrimeNumber
 */
public class TestPrimeNumberCheack {
    public static void main(String [] args){
        int a=2;
        int fCount=0;
        System.out.println("Factors are : ");
        for(int b=1;b<=a;b++){
            if(a%b==0){
                fCount++;
                System.out.println(b);
            }

        }
        System.out.println("Total Factor Count is -> "+fCount);
        if(fCount==2){
            System.out.println("Then "+a+" is a  PrimeNumber");
        }else {
            System.out.println("Then "+a+"is Not a PrimeNumber");
        }
    }
}
