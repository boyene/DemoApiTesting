package ExceptionHandling;

public class TestTryCatchFInallyDemo4 {
    //is there any chance to stop finally block ?
    //System.exit(0);

    static public void main(String[] args){
        try {
            System.out.println("In try ");
           // System.exit(0);
        }catch (Exception e){
            System.out.println("In catch ");
        }
        finally {
            System.out.println("In finally ");
        }
    }

}
