package exam;
interface A{
    void show();
}
interface C extends A{
    void show();
}
public class Test implements C{
   public void display(){
         System.out.println("display method");
   }

    static void main() {
        Test test = new Test();
        test.show();
    }

    @Override
    public void show() {

    }
}
