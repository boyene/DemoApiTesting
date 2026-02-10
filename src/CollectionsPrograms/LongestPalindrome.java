package CollectionsPrograms;

public class LongestPalindrome {
    static void main() {
        String[] names={"madam", "apple", "noon", "civic", "table", "racecar"};
        String longest="";
        for(String name:names){
           if(name.equals(isPalindrome(name))){
               if (name.length()>longest.length()){
                   longest=name;
               }
           }
        }
        System.out.println("Longest Palindrome  : "+longest);
    }
    static String isPalindrome(String s){
        String rev="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            rev=ch+rev;

        }
        return rev;
    }
}
