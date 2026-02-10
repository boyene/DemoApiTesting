package ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class TestCheckedExceptionDemo1 {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\krishna\\OneDrive\\Desktop\\HelloHi\\hello.txt");
        f.createNewFile();
        //file will create in the file path you have given
        System.out.println("hello krishna");

    }

}
