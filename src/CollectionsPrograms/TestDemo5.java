package CollectionsPrograms;

public class TestDemo5 {
    public static void main(String[] args) {

               String input1="azxxzy";
               String input2="azxzxy";
        System.out.println("in 1 "+input1);
        System.out.println("d 1 "+removeAdjacentDuplicates(input1));
        System.out.println("in 2 "+input2);
        System.out.println("d 2 "+removeAdjacentDuplicates(input2));

            }

            public static String removeAdjacentDuplicates(String s) {
                if(s.length()<=1) return s;
                StringBuilder stringBuilder=new StringBuilder();
                int a=0;
                while (a<s.length()){
                    int b=a;
                    while (b+1<s.length()&& s.charAt(a)== s.charAt(b+1)){
                        b++;
                    }
                    if (a==b){
                        stringBuilder.append(s.charAt(a));
                    }
                    a=b+1;
                    String news=stringBuilder.toString();
                    if (news.length()==s.length()){
                        return news;
                    }
                    return removeAdjacentDuplicates(news);
                }

                return s;
            }
        }


