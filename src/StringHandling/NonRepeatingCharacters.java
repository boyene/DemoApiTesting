package StringHandling;

public class NonRepeatingCharacters {
    public static void main(String[] args) {
        String name="abccdee";

        int freq[] =new int[256];

        for (int i = 0; i <name.length() ; i++) {
            freq[name.charAt(i)]++;
        }

        for (int i = 0; i < name.length(); i++) {
            if (freq[name.charAt(i)]==1){
                System.out.print(name.charAt(i));
            }
        }
    }
}
