package Logical;

public class StaticAndInstance {
// Create one class having 4 methods that is 2 Instance methods And 2 Static Methods
    //By creating one Instance Without That also Without in main method
     //

    //instance method
    public void method1(){
        System.out.println(" from instance method1 called");
    }
    public void method2(){
        System.out.println(" from instance method2 called");

    }
    //static methods
    static void method3(){
        System.out.println(" from Static method3 called");

    }
    static void method4(){
        System.out.println(" from Static method4 called");
    }

  /*  static {
        StaticAndInstance staticAndInstance=new StaticAndInstance();
        //Instance methods called By Object reference
        staticAndInstance.method1();
        staticAndInstance.method2();

        //static method Called By Class Name
        StaticAndInstance.method3();
        StaticAndInstance.method4();
    }*/

    static void method6(){
        StaticAndInstance staticAndInstance=new StaticAndInstance();
        //Instance methods called By Object reference
        staticAndInstance.method1();
        staticAndInstance.method2();

        //static method Called By Class Name
        StaticAndInstance.method3();
        StaticAndInstance.method4();


    }

    public static void main(String[] args) {
    StaticAndInstance.method6();
    }
}
