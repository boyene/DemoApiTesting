package ExceptionHandling;
//nested try catch inside the try, catch and finally
public class TestTryCatchFinallyDemo3 {
    public static void main(String[] args){
        try {
            System.out.println("in try 1");
            System.out.println(10 / 5);
            try {
                System.out.println("in try 2");
                System.out.println(10 / 0);
                try {
                    System.out.println("in try 4");
                    System.out.println(10 / 0);
                }catch (Exception e9){
                    System.out.println("in catch4");
                    System.out.println(e9.getMessage());
                }
            }catch (Exception e2){
                System.out.println("in catch2");
                System.out.println(e2.getMessage());
            }
        }catch (Exception e1){
            try {
                System.out.println("in try 3");
                System.out.println(10 / 0);
            } catch (Exception e5) {
                System.out.println("in catch3");
            }
            System.out.println("in catch1");
            System.out.println(e1.getMessage());

        }
        finally {
            try {
                System.out.println("in try 3");
                System.out.println(10 / 0);
            } catch (Exception e1) {
                System.out.println("in catch3");
                e1.printStackTrace();
            }
        }
    }
}
