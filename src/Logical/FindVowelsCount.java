package Logical;

public class FindVowelsCount {
    public static void main(String[] args) {
        String name = "yellakrishna";
        int vowelCount = 0;

        for (int a = 0; a < name.length(); a++) {
            char ch = name.charAt(a);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
                System.out.println(ch);
            }
        }

        System.out.println("Vowel Count: " + vowelCount);
    }
}
