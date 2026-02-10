package WOT;

public class FirstNonReapete {
    static void main() {
        String name="swiss";
        boolean found=false;
        for (int i = 0; i <name.length() ; i++) {
           int count=0;
           char ch=name.charAt(i);
            for (int j = 0; j <name.length() ; j++) {

                if(name.charAt(j)==ch){
                    count++;
                }
            }
            if(count==1){
                System.out.println(ch);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("no on repeating charaters");
        }
    }
}
