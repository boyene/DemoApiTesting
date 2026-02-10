package WOT;

public class Palindrome {
    static void main() {
        int n=121;
        int k=n;
        int rev=0;
        while (n>0){
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        if(k==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("not");
        }

    }
}
