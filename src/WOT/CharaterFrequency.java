package WOT;

public class CharaterFrequency {
    static void main() {
        String s="ssbbccaaa";
        for(int i=0;i<s.length();i++){
            int count=1;
            char ch=s.charAt(i);
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (s.charAt(k) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) continue;
            for (int j = i+1; j <s.length(); j++) {
                if(s.charAt(j)==ch){
                    count++;
                }
            }
            System.out.println(ch + " ->"+count);
        }
    }
}
