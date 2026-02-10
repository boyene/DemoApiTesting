package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestCheckedExceptionDemo3 {
    public static void main(String[] args)throws FileNotFoundException {
        FileReader f=new FileReader("C:\\Users\\krishna\\OneDrive\\Desktop\\HelloHi\\hello.txt");
        try{
            int a=f.read();
            while(a!=-1){
                try {
                    Thread.sleep(1000);
                    System.out.print((char) a);
                    a=f.read();
                }catch (InterruptedException i){
                    System.out.println(i.getMessage());
                }

            }
        }catch (IOException i){
            System.out.println(i.getMessage());
        }



    }
}
