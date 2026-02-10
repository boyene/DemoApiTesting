package Demo1;

public class Demo {


    public static void main(String[] args) {
        try {
            throw new RuntimeException("Runtime Exception");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        } finally {
            System.out.println("Finally Block");
        }
        System.out.println("After Try-Catch");
    }

}
