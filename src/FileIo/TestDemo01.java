package FileIo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestDemo01 {
    public static void main(String[] args) {
        try {
            File f=new File("C:\\Users\\krishna\\OneDrive\\Desktop\\HelloHi\\hello.txt");
            Scanner scanner=new Scanner(f);
            while (scanner.hasNextLine()){
              String line= scanner.nextLine();
              try{
               int num=   Integer.parseInt(line);
               try{
                   int n= 100/num;
                   System.out.println(n);
               } catch (ArithmeticException e) {
                   System.out.println(e);
               }

              } catch (NumberFormatException e) {
                  System.out.println(e);
              }

            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
