package WOT;

public class ReverseString {
    static void main() {
        String s="Krishna";
        String s1="";

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            s1=ch+s1;
        }
        System.out.println(s1);
    }
}
