package NumberProgramsDemo;

public class TestException {
    public static void main(String[] args) {
        int age=10;
        if(age>18){

            System.out.println("right to vote");
        }else {
            try{
                throw new ResourceNotFoundException("no vote");
            } catch (ResourceNotFoundException e) {
               e.printStackTrace();
            }

        }
    }
}
