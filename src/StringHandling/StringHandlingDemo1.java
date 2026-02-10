package StringHandling;

public class StringHandlingDemo1 {
    public static void main(String[] args) {

        //Create String with Literal
        String name="yellakrishna";//Stored in : String constant pool
        //Create String with new Keyword
        String s=new String("yellakrishna");//Stored in : heap area

        System.out.println(name.hashCode());
        System.out.println(s.hashCode());

        //== operator always comparing the address of the object
        if(name==s){
            System.out.println("same");
        }else {
            System.out.println(" not same");
        }
        // .equals method always comparing the content of the String
        if(name.equals(s)){
            System.out.println("same");
        }else {
            System.out.println(" not same");
        }


    }
}
