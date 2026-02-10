package ExceptionHandling;

public class TestDemoCustomExceptionThrow {
    public static void main(String[] args) {

        int age=17;
        if(age>=18){
            System.out.println("eligible to vote ");
        }else
        {

            try {
                throw new ResourceNotFoundException("Not Eligible to vote");
            } catch (ResourceNotFoundException e) {
                e.printStackTrace();
            }

        }
        System.out.println("hoiiii");

     /*   try {
            throw new ResourceNotFoundException("Resource Not Found");
        }catch (ResourceNotFoundException r){
            r.printStackTrace();

        }*/

       // System.out.println("hello");
    }
}
