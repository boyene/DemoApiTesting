package StringHandling;

public class Question1 {
    public static void main(String[] args) {
        String s = "going3 i1 am2 vcube5 to4 moring7 this6";
        String[] words = s.split(" ");
        String result = "";
        int n = 1;
        for (String word : words) {
            for (String w : words) {
                if (w.contains(n + "")) {
                    result +=w.replaceAll("\\d", "") + " ";
                    n++;
                }
            }
        }
        System.out.println(result+" ");
    }
}
