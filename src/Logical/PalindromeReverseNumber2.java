package Logical;

public class PalindromeReverseNumber2 {
    public static void main(String[] args) {
       int n=125;
       int q=0;
      while (n!=0){
         int r =n%10;
         n=n/10;
         q=q*10+r;
      }
        System.out.println(q);
    }
}
