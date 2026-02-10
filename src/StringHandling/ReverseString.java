package StringHandling;

public class ReverseString {
    public static void main(String[] args) {
        String name="shivareddy";
        String rev="";
        for (int a = 0;a<name.length();a++){
          char ch=  name.charAt(a);
          rev=ch+rev;
        }
        System.out.print(rev);
    }
}
