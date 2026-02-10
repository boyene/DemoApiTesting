package Logical;

public class ReverseString {
    public static void main(String[] args) {
        String name="MADAM";
        String rev="";
        for (int a = 0;a < name.length(); a++){
           char ch= name.charAt(a);
            rev = ch + rev;

        }
        System.out.println(rev);

        if(name.equals(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("not");
        }
    }
}
