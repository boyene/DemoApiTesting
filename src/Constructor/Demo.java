package Constructor;

public class Demo {
    static int a=10;
    public static void main(String[] args) {
        Demo d=new Demo();
        Demo d1=new Demo();
        d.a=20;
        System.out.println(d1.a);

        Demo.a=30;

        System.out.println(d.a);
    }
}
