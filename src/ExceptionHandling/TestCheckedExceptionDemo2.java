package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestCheckedExceptionDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        // Unhandled exception type FileNotFoundException
        FileReader fr=new FileReader("C:\\Users\\krishna\\OneDrive\\Desktop\\HelloHi\\hello.txt");
        //Unhandled exception type IOException
        try{
            int n=fr.read();
            while (n!=-1){
                System.out.print((char) n);
                //Unhandled exception type InterruptedException
                try{
                    Thread.sleep(100);
                }catch (InterruptedException i){
                    System.out.println(i.getMessage());
                }
                n=fr.read();

            }
        }catch (IOException i){
           System.out.println( i.getMessage());
        }
        System.out.println("Hello ");

    }
}
