package ExceptionHandling;
class A{
    private void printName(){
        System.out.println("A");
    }
}
class  B extends A{
    public void printName(){
        System.out.println("B");
    }
}
public class AccoliteQuestion {
    static void main() {
//        try{
//            String arr[] =new String[10];
//            arr=null;
//
//            arr[0]="one";
//            System.out.println(arr[0]);
//        } catch (Exception e) {
//            System.out.println("Exception  " );
//        }catch (NullPointerException ne) {
//            System.out.println("Null Pointer Exception  " );
//        }
        B b=new B();
        b.printName();

    }
}
