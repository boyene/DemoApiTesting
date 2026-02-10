package StringHandling;

public class PossiblePermitaions {
    static void main() {
        String s="ABC";
        char[] ch=s.toCharArray();

        permitations(ch,0);

    }

    private static void permitations(char[] ch, int i) {
        if(i==ch.length){
            System.out.println(new String(ch));
            return;
        }

        for(int a=i;a<ch.length;a++){
            swapCharaters(ch,i,a);
            permitations(ch,i+1);
            swapCharaters(ch,i,a);
        }
    }

    private static void swapCharaters(char[] ch, int i, int a) {
        char temp=ch[i];
        ch[i]=ch[a];
        ch[a]=temp;
    }

}
