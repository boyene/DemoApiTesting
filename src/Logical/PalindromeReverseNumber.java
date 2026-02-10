package Logical;

public class PalindromeReverseNumber {
    public static void main(String[] args) {
        int a=151;
        int original=a;
        int q=0;
        while (a != 0){
            int r=a%10;
            a=a/10;
            q=q*10+r;
        }
        System.out.println(q);//To print Reverse a number;
        if(original==q){
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
