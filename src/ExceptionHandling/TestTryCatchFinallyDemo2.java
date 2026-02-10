package ExceptionHandling;
//Note2 :  Whenever we have only try then we must need to have either catch or finally
//CE: Syntax error, insert "Finally" to complete TryStatement
//Note3: if we have try after finally we should not go and write catch block.
//Note 4 : We should not have any statements in between try, catch and finally
//Note 5 : WHenever we have an Exception in try block and you are catching parent exception first and catching child exception later we will get CE
//		CE : Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
//Note6: We should not have multiple finally block, if we keep we will get CE : Syntax error on token "finally", delete this token

public class TestTryCatchFinallyDemo2 {
    public static void main(String[] args){

        System.out.println("Hello main method !!");
        try {
            String s = null;
            System.out.println(s.length());
            System.out.println("in try !!");
            System.out.println(10 / 0);


        } catch (NullPointerException e) {
            System.out.println("In catch of NE ");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("In catch of AE ");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("In catch of E ");
            e.printStackTrace();
        } finally {
            System.out.println("in finally");
        }
        System.out.println("Krishna Java");
        System.out.println("Welcome to HelloWorld ");
    }

}

