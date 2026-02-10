package ExceptionHandling;

public class FinallyInWithSystemExit {
    public static void main(String[] args) {
        try{
            String name=null;
            System.out.println(name.length());
        }catch (NullPointerException n){
            System.out.println(n.getMessage());
        }
       finally {
            System.out.println("from finally");
            try{

            }catch (Exception e){
                try {

                }catch (Exception e1){

                }finally {
                    System.out.println("hello from nested" );
                }
            }
        }

        System.out.println("hello");
        System.out.println("hi");
    }
}
