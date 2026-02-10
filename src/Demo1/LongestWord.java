package Demo1;

public class LongestWord {
    public static void main(String[] args) {
        String sentance="Java is a Powerful Programming language";
        String longest=findLongestWord(sentance);
        System.out.println("The longest word is : "+longest);
    }
    public static String findLongestWord(String sentance){
       String [] words= sentance.split(" ");
       String longest="";
       for (String word:words){
           if (word.length()>longest.length()){
               longest=word;
           }
       }
        return longest;
    }
}

