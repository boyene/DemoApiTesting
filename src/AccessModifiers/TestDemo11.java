package AccessModifiers;

 public class TestDemo11 {
    //private DATA
    private int a=101;
    private String name="yellak";
    //Default Data
     int age=21;
     String email="yellakrishnaboyen@gmail.com";

     //Public Data
     public int Room=203;
     public String Address="KPHB";

     //Protected Data
     protected int b=20;
     protected double salary=1000.0;
    public static void main(String[] args){
        TestDemo11 t=new TestDemo11();
      /*  System.out.println(t.a);
        System.out.println(t.name);
        t.method1();*/

        //default Data
        System.out.println(t.age);
        System.out.println(t.email);
        t.mathod2();

        //protected

        System.out.println(t.b);
        System.out.println(t.salary);
        t.method4();


    }
   private void method1(){
        System.out.println("Method1");
    }
    //class Scope for blocks
     {
        System.out.println("Block");
    }
    void mathod2(){
        System.out.println("Default Method");
    }
    public void method3(){
        System.out.println("Method3");
    }
    protected void method4(){
        System.out.println("Method4");
    }

}
