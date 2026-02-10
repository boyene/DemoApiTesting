package Demo1;

public class LongestWord02 {
    public static void main(String[] args) {
        String name="Java is Simple Programing Language";
        String [] words= name.split(" ");
        String longest="";
        for (String word:words){
            if(word.length()>longest.length()){
                longest=word;
            }
        }
        System.out.println("longest word is : "+ longest);
    }
}
