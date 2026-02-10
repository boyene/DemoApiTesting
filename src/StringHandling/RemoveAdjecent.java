package StringHandling;

public class RemoveAdjecent {
    public static void main(String[] args) {
        String name="AKAKBNBY";

        while (true) {
            int count=0;
            for (int i = 1; i < name.length(); i++) {
                if (name.charAt(i) == name.charAt(i - 1)) {
                    name = name.substring(0, i - 1) + name.substring(i + 1, name.length());
                    count++;
                }
            }
            if (count==0){
                break;
            }
        }
        System.out.println(name);
    }
}
