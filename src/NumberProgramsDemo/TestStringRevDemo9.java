package NumberProgramsDemo;

public class TestStringRevDemo9 {
    public static void main(String[] args){

        String name = "madam";
        String rev = "";

        for (int a = 0; a < name.length(); a++) {
            char ch = name.charAt(a);
            rev = ch + rev;
        }
        System.out.println(rev);

        if(name.equals(rev)){
            System.out.println("Palindrome String");
        }else {
            System.out.println("Not a Palindrome String");
        }

    }
}
