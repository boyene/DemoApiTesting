package StringHandling;

public class VowelsCount {
    public static void main(String[] args) {
        int vowelCount = 0;
        int consonantCount = 0;
        String name = "Java Is High Level Programming Language";

        for (int a = 0; a < name.length(); a++) {
            char ch = name.charAt(a);

            // Convert character to lowercase to handle both cases
            char lowerCh = Character.toLowerCase(ch);

            if (lowerCh >= 'a' && lowerCh <= 'z') { // Consider only alphabets
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    vowelCount++;
                    System.out.println(ch + " is a vowel");
                } else {
                    consonantCount++;
                    System.out.println(ch + " is a consonant");
                }
            }
        }

        System.out.println("Vowel count is: " + vowelCount);
        System.out.println("Consonant count is: " + consonantCount);
    }
}
