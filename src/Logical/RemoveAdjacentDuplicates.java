package Logical;
public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {
        String str = "azxxzy";

        boolean changed = true;

        for (; changed; ) {
            StringBuilder sb = new StringBuilder();
            changed = false;

            for (int i = 0; i < str.length(); ) {
                if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    // Found duplicate characters
                    char dup = str.charAt(i);
                    changed = true;
                    // Skip all adjacent same characters
                    while (i < str.length() && str.charAt(i) == dup) {
                        i++;
                    }
                } else {
                    sb.append(str.charAt(i));
                    i++;
                }
            }

            str = sb.toString(); // Update string for next pass
        }

        System.out.println("Output: " + str);
    }
}
