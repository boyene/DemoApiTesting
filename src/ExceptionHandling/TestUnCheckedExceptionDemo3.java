package ExceptionHandling;

public class TestUnCheckedExceptionDemo3 {
    public static void main(String [] args){
       /* int [] n=new int[-10];
        System.out.println(n);
        NegativeArraySizeException
        */
        try {
            int [] n=new int[-10];
            System.out.println(n);
        }catch (Exception e){
           System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        System.out.println("Good morning !!");
        System.out.println("Have a Good day !!");
    }
}
