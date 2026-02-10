package StringHandling;

public class RemoveadjecentCharatersQuestion2 {
    static void main() {
    String name="AKKABNBY";
    while (true) {
        int count=0;
      for (int i=0;i<name.length();i++) {
          if(i<name.length()-1 && name.charAt(i)==name.charAt(i+1)){
             name= name.substring(0,i)+name.substring(i+2);
                count++;
          }
      }
        if(count==0) {
            break;
        }
    }
        System.out.println(name);
    }
}
