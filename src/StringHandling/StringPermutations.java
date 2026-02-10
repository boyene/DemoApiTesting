package StringHandling;

public class StringPermutations {
    static void main() {
        String s="abc";
        printPermutations(s,"");
    }

    private static void printPermutations(String ros, String s) {
        if(ros.length()==0){
            System.out.println(s);
            return;
        }
        for(int i=0;i<ros.length();i++){
            char ch=ros.charAt(i);
            String newRos=ros.substring(0,i)+ros.substring(i+1);
            printPermutations(newRos,s+ch);
        }
    }
}
