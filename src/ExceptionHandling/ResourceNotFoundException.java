package ExceptionHandling;

public class ResourceNotFoundException extends Exception{
    ResourceNotFoundException(String s){
        super(s);
    }
}
