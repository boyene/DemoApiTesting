package Logical;

public class NeonNumber {
    public static void main(String[] args) {
        int n=5;
        int r= n*n;
        int sum=0;
        while (r>0){
         int i= r%10;
         sum=sum+i;
            r=r/10;
        }
        System.out.println("sum : "+sum);
        if(sum==n){
            System.out.println("neon");
        }else{
            System.out.println("not neon");
        }
    }
}
