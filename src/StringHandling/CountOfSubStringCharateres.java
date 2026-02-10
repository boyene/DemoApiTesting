package StringHandling;

public class CountOfSubStringCharateres {
    public static void main(String[] args) {
        System.out.println(countoccurancesubstring("ababbaabab","ab"));
        System.out.println(countoccurancesubstring("qwertyu","o"));
    }
     static int countoccurancesubstring(String str, String k) {
        int count=0;
        int index=0;
        while ((index=str.indexOf(k,index))!=-1){
            count++;
            index+=k.length();
        }
        return count;
    }
}
