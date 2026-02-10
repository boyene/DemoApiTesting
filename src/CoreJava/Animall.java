package CoreJava;

public interface Animall {
    String name="Animal Iam";
    public abstract String sound();
    public abstract String Walking();
    void method1();
    void method2();

    default void hunting(){
        System.out.println("Hunting default");
        methiod4();
    }
    //1.8
    default void method(){
        System.out.println("Hello default");
    }
    //1.8
    static void method3(){
        System.out.println("Hello Static");
    }
    //1.9
    private void methiod4(){
        System.out.println("Hello private");
    }
}
