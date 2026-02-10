package StringHandling;

public class FirstReapitingCharater {
    public static void main(String[] args) {
        String name1="swwiss";
        boolean found=false;
        System.out.println("first non-Repeating charter : ");
        for (int i = 0; i <name1.length() ; i++) {
          char ch=  name1.charAt(i);
          int count = 0;
            for (int j = 0; j < name1.length(); j++) {
                if(name1.charAt(j)==ch){
                    count++;
                }
            }

            if(count==1){
                System.out.println(ch);
                found=true;
                break;
            }
        }

        if (!found){
            System.out.println("No non repeating charters in the string");
        }



    }
}
