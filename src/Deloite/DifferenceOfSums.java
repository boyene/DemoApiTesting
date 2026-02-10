package Deloite;

public class DifferenceOfSums {
    public static void main(String[] args) {
        int n=4;
        int m=20;
        int result;
        int divisibleSum=0;
        int nonDivisibleSum=0;

        for(int i=1;i<=m;i++){
            if(i%n==0){
                divisibleSum+=i;
            }else{
                nonDivisibleSum+=i;
            }
        }
        if(divisibleSum>nonDivisibleSum){
           result=divisibleSum-nonDivisibleSum;
        }else {
            result=nonDivisibleSum-divisibleSum;
        }
        System.out.println(result);
    }
}
