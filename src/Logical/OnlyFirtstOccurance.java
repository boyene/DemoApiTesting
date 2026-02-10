package Logical;

public class OnlyFirtstOccurance {
    public static void main(String[] args) {
        String name="banannas";
        String result="";
        for (int i = 0; i < name.length(); i++) {
               char ch= name.charAt(i);
               if(result.indexOf(ch)==-1){
                   result+=ch;
               }

        }
        System.out.println(result);
    }
}
