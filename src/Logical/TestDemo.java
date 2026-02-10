package Logical;



public class TestDemo {


    public static void main(String[] args) {
        String s="madam";
        String rev="";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                boolean b=isPalin(s,i,j);
                System.out.println(b);
            }
        }


    }
    static boolean isPalin(String s,int start,int end){
        String s1=s.substring(start,end);
        start++;
        end--;
        return true;
    }
}
